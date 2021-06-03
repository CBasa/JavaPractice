package week_1_java.streams_terminal;

import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamsJoiningExample {
	
	public static String joining_1() {
		
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining(", "));
	}
	
	public static String joining_3() {
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining(", ", "Students: ", "."));
	}

	public static void main(String[] args) {
		
		System.out.println("Joining 1: "+joining_1());
		System.out.println("Joining 2: "+joining_2());
		System.out.println("Joining 3: "+joining_3());

	}

}
