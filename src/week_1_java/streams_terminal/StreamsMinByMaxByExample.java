package week_1_java.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy() {

		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxBy() {

		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {

		Optional<Student> studentOptionalMinBy = minBy();
		if (studentOptionalMinBy.isPresent()) {
			System.out.println("[MINBY] Result: " + studentOptionalMinBy.get());
		} else {
			System.out.println("[MINBY] Student not found");
		}
		
		Optional<Student> studentOptionalMaxBy = maxBy();
		if (studentOptionalMaxBy.isPresent()) {
			System.out.println("[MAXBY] Result: " + studentOptionalMaxBy.get());
		} else {
			System.out.println("[MAXBY] Student not found");
		}

	}

}
