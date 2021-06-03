package week_1_java.collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//default initial capacity (16)
		Set<String> set1 = new HashSet<String>();
		set1.add("Adam");
		set1.add("John");
		set1.add("Mary");
		set1.add("Bob");
		set1.add("Anna");
		System.out.println("set1: "+set1);
		set1.forEach(System.out::println);
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Adam");
		set2.add("John");
		
		System.out.println("set2: "+set2);
		
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println("set1: "+set1);
		
		System.out.println(set1.contains("Adam")); //true
		System.out.println(set1.contains("adam")); //false

	}

}
