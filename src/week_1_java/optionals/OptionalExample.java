package week_1_java.optionals;

import java.util.Optional;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class OptionalExample {
	
	public static String getStudentName() {
//		Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		
		if (student!=null) {
			return student.getName();
		} else {
			return null;
		}
	}
	
	public static Optional<String> getStudentNameOptional() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//		Optional<Student> studentOptional = Optional.ofNullable(null);
		
		if (studentOptional.isPresent()) {
//			studentOptional.get(); //Student
			return studentOptional.map(Student::getName); //Optional<String>
		}
		
		return Optional.empty();
	}

	public static void main(String[] args) {

//		String name = getStudentName();
//		
//		if (name!=null) {
//			System.out.println("Length of student name: "+ name.length());
//		} else {
//			System.out.println("name not found");
//		}
		
		Optional<String> stringOptional = getStudentNameOptional();
		
		// null can be returned by any type but isPresent() checks Optionals
		if (stringOptional.isPresent()) {
			System.out.println("Student name: "+ stringOptional.get()); // .get() removes Optional wrapper and just returns String
		} else {
			System.out.println("name not found");
		}

	}

}
