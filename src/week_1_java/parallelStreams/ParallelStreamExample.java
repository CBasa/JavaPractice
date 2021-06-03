package week_1_java.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static long checkPerformanceResult(Supplier<Integer> supplier, int numOfTimes) {
		//Performance based on time taken to execute for loop a certain number of times
		long startTime = System.currentTimeMillis();
		for (int i=0;i<numOfTimes;i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		
		return endTime-startTime;
	}
	
	// Supplier - no input, produces output
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000)
		.sum();
	}
	
	// Supplier - no input, produces output
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000)
				.parallel() //splits data into multiple parts and processes them concurrently
				.sum();
	}

	public static void main(String[] args) {
//		System.out.println(sumSequentialStream());
//		System.out.println(sumParallelStream());
		
		//Running a sequential stream uses 1 processor whereas parallel streams run on multiple processors
		System.out.println(Runtime.getRuntime().availableProcessors()); //12
		
		//Parallel stream is slightly faster than sequential
		System.out.println("[SEQUENTIAL]" + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
		System.out.println("[PARALLEL]" + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
	}

}
