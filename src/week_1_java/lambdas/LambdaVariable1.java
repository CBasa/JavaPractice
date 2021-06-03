package week_1_java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
	
	static int otherNumber = 3;
	
	public static void main(String[] args) {
		int number = 3; // Effectively final in lambdas
		//number=4;  cannot modify local variable referenced in lambda
		Consumer<Integer> c1 = (i) -> {
//			number=4;  cannot modify local variable referenced in lambda
			otherNumber++; // can modify class variables
			System.out.println("Value is: "+ (i+number+otherNumber));
		};
		
		c1.accept(5);
	}

}
