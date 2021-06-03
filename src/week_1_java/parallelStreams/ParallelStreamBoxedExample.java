package week_1_java.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
	
	public static int sequentialSum(List<Integer> integerList) {
		
		long start = System.currentTimeMillis();
		int sum = integerList
				.stream()
				.reduce(0, (x,y)->x+y);
		long duration = System.currentTimeMillis()-start;
		System.out.println("[SEQUENTIAL] Duration: " + duration);
		
		return sum;
	}
	
	public static int parallelSum(List<Integer> integerList) {
		
		long start = System.currentTimeMillis();
		int sum = integerList
				.parallelStream()
				.reduce(0, (x,y)->x+y); //performs unboxing from Integer to int
		long duration = System.currentTimeMillis()-start;
		System.out.println("[PARALLEL] Duration: " + duration);
		
		return sum;
	}

	public static void main(String[] args) {
		
		List<Integer> integerList = IntStream.rangeClosed(1, 10000)
			.boxed() // int => Integer
			.collect(Collectors.toList());
		
		//Parallel takes longer
		sequentialSum(integerList);
		parallelSum(integerList);

	}

}
