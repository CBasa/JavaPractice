package week_1_java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	static Function<String, String> upperCase = (name) -> name.toUpperCase(); 
	static Function<String, String> addString = (name) -> name.concat("world"); 

	public static void main(String[] args) {
		
		System.out.println("Result is: "+upperCase.apply("hello"));
		System.out.println("Result of andThen is: "+upperCase.andThen(addString).apply("hello"));  //andThen executes in order
		System.out.println("Result of compose is: "+upperCase.compose(addString).apply("hello"));  //compose executes its parameter first
		
	}

}
