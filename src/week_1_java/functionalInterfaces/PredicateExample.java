package week_1_java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> p1 = (i) -> {return i%5==0;}; 
	static Predicate<Integer> p2 = (i) -> i%2==0;  //no return or {} needed if one line

	public static void predicateAnd() {
		System.out.println("PredicateAnd result is: "+p1.and(p2).test(16)); //predicate chaining
		System.out.println("PredicateAnd result is: "+p1.and(p2).test(20));
	}
	
	public static void predicateOr() {
		System.out.println("PredicateOr result is: "+p1.or(p2).test(16)); //predicate chaining
		System.out.println("PredicateOr result is: "+p1.or(p2).test(20));
	}
	
	public static void predicateONegate() {
		System.out.println("PredicateNegate result is: "+p1.or(p2).negate().test(16)); //predicate chaining
		System.out.println("PredicateNegate result is: "+p1.or(p2).negate().test(20));
	}
	
	public static void main(String[] args) {
		
		System.out.println(p1.test(5)); //'test' takes in input
		
		predicateAnd();
		predicateOr();
		predicateONegate();
	}

}
