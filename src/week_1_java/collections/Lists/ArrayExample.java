package week_1_java.collections.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] intArray1 = new int[10]; // initialize array by specifying length
		
		intArray1[0] = 14;
		intArray1[1] = 23;
		
		System.out.println(intArray1[1]);
		
		int[] intArray2 = {1,1,2,3,4,5};
		
		for (int i : intArray2) {
			System.out.println(i);
		};
		
		List<String> names = new ArrayList<>();
		names.add("adam1");
		names.add("adam2");
		names.add("adam4");
		names.add("adam3");
		names.remove(1);
		System.out.println(names);

		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		Collections.swap(names, 0, 1);
		System.out.println(names);
		
		System.out.println("names array size: "+names.size());
		
		names.forEach(System.out::println);
		
		for (String i : names) {
			System.out.println(i);
		};
		
		List<String> stringList = Arrays.asList("a string","another string","other string");
		for (String i : stringList) {
			System.out.println(i);
		};
		
		System.out.println(names.contains("adam3"));
		System.out.println(stringList.get(1));
		
		String collect = stringList.stream().filter(s->s.contains("other")).collect(Collectors.joining("HELLO"));
		
		System.out.println(collect);
		
	}
}
