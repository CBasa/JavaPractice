package week_1_java.optionals;

import java.util.Optional;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class OptionalOrElseExample {
	
	//orElse
	public static String optionalOrElse() {
		Optional<Student> studentOptional = 
//				Optional.ofNullable(StudentDataBase.studentSupplier.get());
				Optional.ofNullable(null);
		
		String name = studentOptional
				.map(Student::getName)
				.orElse("default"); // accepts a String
		
		return name;
	}
	
	//orElseGet
	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
//				Optional.ofNullable(null);
		
		String name = studentOptional
				.map(Student::getName)
				.orElseGet(()->"default"); // accepts a Supplier<String>
		
		return name;
	}
	
	//orElseThrow
	public static String optionalOrElseThrow() {
		Optional<Student> studentOptional = 
//				Optional.ofNullable(StudentDataBase.studentSupplier.get());
				Optional.ofNullable(null);
		
		String name = studentOptional
				.map(Student::getName)
				.orElseThrow(()->new RuntimeException("no data found")); 
		
		return name;
	}

	public static void main(String[] args) {

		System.out.println("orElse: "+optionalOrElse());
		System.out.println("orElseGet: "+optionalOrElseGet());
		System.out.println("orElseThrow: "+optionalOrElseThrow());

	}

}
