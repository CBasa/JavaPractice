package week_1_java.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 50).sum();
		
		System.out.println("Sum is: "+sum);
		
		OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
		
		System.out.println(optionalInt.isPresent()?"Max Int is: "+optionalInt.getAsInt():"Max value not found");
	
		OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
	
		System.out.println(optionalLong.isPresent()?"Min Long is: "+optionalLong.getAsLong():"Min value not found");

		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
		
		System.out.println(optionalLong.isPresent()?"Avg Double is: "+optionalDouble.getAsDouble():"Avg value not found");
	}

}
