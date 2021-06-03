package week_1_java.optionals;

import java.util.Optional;

import week_1_java.data.Bike;
import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class OptionalMapFlatMapExample {
	
	//filter
	public static void optionalFilter() {
		Optional<Student> studentOptional = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
//				Optional.ofNullable(null);
		
		studentOptional
//			.filter(student -> student.getGpa()>=3.5)
			.filter(student -> student.getGpa()>=4.0)
			.ifPresent(System.out::println);
	}
	
	public static void optionalMap() {
		Optional<Student> studentOptional = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
//				Optional.ofNullable(null);
		
		if (studentOptional.isPresent()) {
			Optional<String> stringOptional = studentOptional
				.filter(student -> student.getGpa()>=3.5)
//				.filter(student -> student.getGpa()>=4.0)
				.map(Student::getName);	//map returns Optional<String>
			System.out.println(stringOptional.get());
		}
	}
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = 
				Optional.ofNullable(StudentDataBase.studentSupplier.get());
//				Optional.ofNullable(null);
		
		Optional<String> name = studentOptional
			.filter(student -> student.getGpa()>=3.5)
			.flatMap(Student::getBike) // Optional<Student Optional<Bike>> => Optional<Bike>
			.map(Bike::getName);
		
		System.out.println(name);
	}

	public static void main(String[] args) {

		optionalFilter();
		optionalMap();
		optionalFlatMap();

	}

}
