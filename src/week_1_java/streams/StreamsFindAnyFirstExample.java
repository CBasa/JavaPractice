package week_1_java.streams;

import java.util.Optional;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

// Returns element if found
public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa()>=3.9)
			// Adam
			// Jenny
			// Emily => gpa=4.0
			.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa()>=3.9)
			// Adam
			// Jenny
			// Emily => gpa=4.0
			.findFirst();
	}
	
	public static void main(String[] args) {

		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if (studentOptionalFindAny.isPresent()) {
			System.out.println("[ANY] Found the student: "+studentOptionalFindAny.get());
		} else {
			System.out.println("[ANY] Student not found");
		}
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if (studentOptionalFindFirst.isPresent()) {
			System.out.println("[FIRST] Found the student: "+studentOptionalFindFirst.get());
		} else {
			System.out.println("[FIRST] Student not found");
		}
		
	}

}
