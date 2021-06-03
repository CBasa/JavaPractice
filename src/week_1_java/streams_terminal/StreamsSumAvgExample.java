package week_1_java.streams_terminal;

import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {

		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));

	}

	public static Double avg() {

		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));

	}

	public static void main(String[] args) {

		System.out.println("Total notebooks: " + sum());
		System.out.println("Average notebooks: " + avg());

	}

}
