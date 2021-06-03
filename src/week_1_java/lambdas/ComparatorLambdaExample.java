package week_1_java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);    // o1==o2 -> 0
											// o1>o2 -> 1
											// o1<o2 -> -1
			}
		};
		
		System.out.println("Result of comparator is: " + comparator.compare(5, 2));
		
		Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println("Result of comparator using lambda is: " + comparatorLambda1.compare(2, 2));
		
		// Type is already specified at the start so parameters are automatically casted as Integers
		Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
		System.out.println("Result of comparator using lambda is: " + comparatorLambda2.compare(2, 5));
	}
	
}
