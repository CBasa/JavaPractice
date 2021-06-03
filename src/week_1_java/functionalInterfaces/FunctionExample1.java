package week_1_java.functionalInterfaces;

public class FunctionExample1 {
	
	public static String performConcat(String str) {
		return FunctionExample.addString.apply(str);
	}

	public static void main(String[] args) {
		
		String result = performConcat("hello");
		System.out.println("Result is: "+result);
		
	}

}
