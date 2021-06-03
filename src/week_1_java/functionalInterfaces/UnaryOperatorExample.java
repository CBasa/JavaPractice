package week_1_java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	//Input and output is the same type
	static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");
	
	public static void main(String[] args) {
		
		System.out.println(unaryOperator.apply("hello"));

	}

}
