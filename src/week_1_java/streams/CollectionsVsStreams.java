package week_1_java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("adam");
		names.add("jim");
		names.add("bob");
		names.remove(0);
		System.out.println(names);
		
		for (String name: names) {
			System.out.println(name);
		}
		
//		names.stream(); cannot add, delete or modify elements in a stream

		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
//		nameStream.forEach(System.out::println); Stream can only be operated upon once
		
		
	}

}
