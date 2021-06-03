package week_1_java.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Range count: " + intStream.count());

		IntStream.range(1, 50).forEach(i -> System.out.print(i + ","));
		System.out.println();
		System.out.println("Range count: " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(i -> System.out.print(i + ","));
		System.out.println();
		System.out.println("Long Stream Range count: " + LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(i -> System.out.print(i + ","));
		System.out.println();
		System.out.println("Double Stream Range count: " + IntStream.rangeClosed(1, 50).asDoubleStream().count());
		IntStream.rangeClosed(1, 50).asDoubleStream().forEach(i -> System.out.print(i + ","));;
	
	}

}
