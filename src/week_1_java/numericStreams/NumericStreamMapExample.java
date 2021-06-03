package week_1_java.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
	
	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5)
			.mapToObj(Integer::new)
			.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)
			.mapToLong(Long::new)
			.sum();
	}
	
	public static List<Double> mapToDouble() {
		return IntStream.rangeClosed(1, 5)
			.mapToDouble(Double::new)
//			.sum();
			.boxed()
			.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println("mapToObj: " + mapToObj());
		System.out.println("mapToLong: " + mapToLong());
		System.out.println("mapToDouble: " + mapToDouble());

	}

}
