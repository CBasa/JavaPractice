package week_1_java.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void partitioningBy_1() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

		Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate));

		System.out.println("partitioningMap: " + partitioningMap);
	}
	
	public static void partitioningBy_2() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		
		Map<Boolean, Integer> partitioningMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate,
						Collectors.summingInt(Student::getNotebooks)));
		
		System.out.println("partitioningMap2: " + partitioningMap);
	}

	public static void main(String[] args) {
		
		partitioningBy_1();
		partitioningBy_2();

	}

}
