package week_1_java.optionals;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
	
	public static Optional<String> ofNullable(){
		Optional<String> stringOptional = Optional.ofNullable("hello");
//		Optional<String> stringOptional = Optional.ofNullable(null);
		
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional = Optional.of("hello");
//		Optional<String> stringOptional = Optional.of(null);  
		
		return stringOptional;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}

	public static void main(String[] args) {
		
		System.out.println("ofNullable: "+ofNullable());
		System.out.println("of: "+of()); // cannot be null
		System.out.println("empty: "+empty());

	}

}
