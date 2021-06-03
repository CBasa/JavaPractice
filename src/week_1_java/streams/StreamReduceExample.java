package week_1_java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
			//1
			//2
			//3
			//4
			//a=1, b=1 (from stream) => result 1 is returned
			//a=1, b=2 (from stream) => result 2 is returned
			//a=2, b=3 (from stream) => result 6 is returned
			//a=6, b=3 (from stream) => result 18 is returned
			.reduce(1,(a,b)-> a*b); //b is the value from the stream and a is the result of the reduce operation
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
				.reduce((a,b)-> a*b);  // no identity returns an Optional<Integer>
	}
	
	public static Optional<Student> getHighestGpaStudent() {
		return StudentDataBase.getAllStudents()
			.stream()
			.reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2); // ternary operator
	}

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4);
		List<Integer> integers1 = new ArrayList<>();
		System.out.println(performMultiplication(integers));

		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
		System.out.println(result.isPresent());
		System.out.println(result.get()); //'get' will produce exception if no value present
		
		Optional<Student> studentOptional = getHighestGpaStudent();
		
		if (result1.isPresent()) {
			System.out.println(studentOptional.get());
		}
		
		if (studentOptional.isPresent()) {
			System.out.println(studentOptional.get());
		}
	}

}
