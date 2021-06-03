package week_1_java.parallelStreams;

import java.util.stream.IntStream;

public class SumClient {
	
	// If you have a mutable variable, then do not use parallel streams

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		
		IntStream.rangeClosed(1, 1000)
//			.parallel()
			//using parallel gives a different total ever run because it is concurrently updating the total
			.forEach(sum::performSum);
		
		System.out.println(sum.getTotal());

	}

}
