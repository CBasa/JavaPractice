package week_1_java.collections.Sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<>();
		
		set1.add(56);
		set1.add(32);
		set1.add(7);
		set1.add(18);
		set1.add(234);
		
		set1.forEach(System.out::println); //Stored in ascending order
		
	}

}
