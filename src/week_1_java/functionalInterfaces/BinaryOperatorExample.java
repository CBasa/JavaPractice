package week_1_java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		
		//Input and output is the same type - 2 inputs
		BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
		System.out.println(binaryOperator.apply(1, 2));
		
		//returns greater of two values
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of maxBy: "+maxBy.apply(5, 2));
		
		//returns lesser of two values
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result of minBy: "+minBy.apply(5, 2));
	}

}
