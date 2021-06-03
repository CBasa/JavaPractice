package week_1_java.collections.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample {

	public static void main(String[] args) {

		// linkedSet maintains order of insertion
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Adam");
		linkedSet.add("John");
		linkedSet.add("Mary");
		linkedSet.add("Bob");
		linkedSet.add("Anna");
		System.out.println("linkedSet: " + linkedSet);
		linkedSet.forEach(System.out::println);
	}

}
