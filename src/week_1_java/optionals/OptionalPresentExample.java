package week_1_java.optionals;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		//isPresent
		Optional<String> optional = 
//				Optional.ofNullable(null);
				Optional.ofNullable("hello");
		System.out.println(optional.isPresent());
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//ifPresent
		optional.ifPresent(System.out::println);
	}

}
