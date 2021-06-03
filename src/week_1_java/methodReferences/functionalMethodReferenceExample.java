package week_1_java.methodReferences;

import java.util.function.Function;

public class functionalMethodReferenceExample {

	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
	
	static Function<String, String> toUpperCaseMethodRef = String::toUpperCase; //shortcut CTRL+1 and convert to method reference
	
	public static void main(String[] args) {
		
		System.out.println(toUpperCaseLambda.apply("hello"));
		System.out.println(toUpperCaseMethodRef.apply("hello"));
	}

}
