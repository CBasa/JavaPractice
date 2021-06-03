package week_1_java.collections.Sets;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		SortedSet<Integer> set2 = new TreeSet<>();

		set2.add(56);
		set2.add(32);
		set2.add(7);
		set2.add(18);
		set2.add(234);
		
		System.out.println("Lowest value: "+set2.first());
		System.out.println("Highest value: "+set2.last());

		Set<Integer> subset = set2.subSet(18, 235); // start inclusive, end exclusive
		System.out.println("SUBSET:");
		subset.forEach(System.out::println);

		Set<Integer> tailset = set2.tailSet(32); // inclusive
		System.out.println("TAILSET:");
		tailset.forEach(System.out::println);

		Set<Integer> headset = set2.headSet(32); //exclusive
		System.out.println("HEADSET:");
		headset.forEach(System.out::println);

	}

}
