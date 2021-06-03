package week_1_java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {

		return integerList.stream()
				// 1 -> y
				// 2 -> y
				// 3 -> y
				// 4 -> y
				// x will hold the max value for each element in the iteration
				.reduce(0, (x, y) -> x > y ? x : y);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {

		return integerList.stream()
				// 1 -> y
				// 2 -> y
				// 3 -> y
				// 4 -> y
				// x will hold the max value for each element in the iteration
				.reduce((x, y) -> x > y ? x : y);
	}
	
	public static int findMinValue(List<Integer> integerList) {
		
		return integerList.stream()
				// 1 -> y
				// 2 -> y
				// 3 -> y
				// 4 -> y
				// x will hold the max value for each element in the iteration
				.reduce(0, (x, y) -> x < y ? x : y); //never use identity for min value
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		
		return integerList.stream()
				// 1 -> y
				// 2 -> y
				// 3 -> y
				// 4 -> y
				// x will hold the max value for each element in the iteration
				.reduce((x, y) -> x < y ? x : y);
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> integerList = new ArrayList<>();

		System.out.println("Max value: " + findMaxValue(integerList));
		System.out.println("Min value: " + findMinValue(integerList));
//		System.out.println("Max value: " + findMaxValue(integerList1));
		
		
		Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
		if (maxValueOptional.isPresent()) {
			System.out.println("Max optional value: " + findMaxValueOptional(integerList).get());
		} else {
			System.out.println("List is empty");
		}
		
		Optional<Integer> minValueOptional = findMinValueOptional(integerList);
		if (minValueOptional.isPresent()) {
			System.out.println("Min optional value: " + findMinValueOptional(integerList).get());
		} else {
			System.out.println("List is empty");
		}
			
	}

}
