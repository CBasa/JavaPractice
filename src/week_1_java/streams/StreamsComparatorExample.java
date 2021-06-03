package week_1_java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {
		List<Student> studentsByName = StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
		return studentsByName;
	}
	
	public static List<Student> sortStudentsByGpaAsc() {
		List<Student> studentsByGpaAsc = StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
		return studentsByGpaAsc;
	}
	
	public static List<Student> sortStudentsByGpaDesc() {
		List<Student> studentsByGpaDesc = StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed()) // reversed reverses order of stream
				.collect(Collectors.toList());
		return studentsByGpaDesc;
	}
		
	public static void main(String[] args) {
//		System.out.println(sortStudentsByName()); forEach prints each element on new line - more readable
		
		// SORT BY NAME
		System.out.println("Students by name:-----------------------");
		sortStudentsByName().forEach(System.out::println);
		// SORT BY GPA
		System.out.println("Students by Gpa (Ascending):------------");
		sortStudentsByGpaAsc().forEach(System.out::println);
		System.out.println("Students by Gpa (Descending):------------");
		sortStudentsByGpaDesc().forEach(System.out::println);

	}

}
