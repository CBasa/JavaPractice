package week_1_java.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
	
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
				.boxed()
				.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> integerList) {
		//wrapper to primitive
		return integerList.stream()
			.mapToInt(Integer::intValue)
			.sum();
	}

	public static void main(String[] args) {

		System.out.println("Boxing: "+boxing());
		System.out.println("unBoxing: "+unBoxing(boxing()));
	}

}
