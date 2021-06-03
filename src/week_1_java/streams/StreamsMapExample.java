package week_1_java.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class StreamsMapExample {

	public static List<String> namesList() {
		List<String> studentList = StudentDataBase.getAllStudents().stream()
		//Student as an input -> Student name	
		.map(Student::getName) // Stream<String>
		.map(String::toUpperCase) // Stream<String> -> uppercase
		.collect(Collectors.toList()); // List<String>
		
		return studentList;
	};
	
	public static Set<String> namesSet() {
		Set<String> studentSet = StudentDataBase.getAllStudents().stream()
				//Student as an input -> Student name	
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) // Stream<String> -> uppercase
				.collect(Collectors.toSet()); // List<String>
		
		return studentSet;
	};
	
	public static void main(String[] args) {
		
		System.out.println(namesList());
		System.out.println(namesSet());

	}

}
