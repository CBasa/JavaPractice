package week_1_java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integerList) {

		return integerList.stream()
				.limit(3)
				.reduce((x, y) -> x+y);
	}
	
	public static Optional<Integer> skip(List<Integer> integerList) {

		return integerList.stream()
				.skip(3)
				.reduce((x, y) -> x+y);
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		
		Optional<Integer> limitValueOptional = limit(integerList);
		if (limitValueOptional.isPresent()) {
			System.out.println("Limit optional value: " + limit(integerList).get());
		} else {
			System.out.println("List is empty");
		}
		
		Optional<Integer> skipValueOptional = skip(integerList);
		if (skipValueOptional.isPresent()) {
			System.out.println("Skip optional value: " + skip(integerList).get());
		} else {
			System.out.println("List is empty");
		}

	}

}
