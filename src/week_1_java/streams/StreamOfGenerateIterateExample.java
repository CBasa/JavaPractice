package week_1_java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {
		
		//OF
		Stream<String> stringStream = Stream.of("adam","jenny","emily");
		stringStream.forEach(System.out::println);
		
		//ITERATE
		Stream.iterate(1, x->x*2)
			.limit(10)
			.forEach(System.out::println);
		
		//GENERATE
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier)
			.limit(10)
			.forEach(System.out::println);;
		
	}

}
