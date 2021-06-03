package week_1_java.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class ParallelStreamExample1 {
	
	public static List<String> sequentialPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		 List<String> studentActivities = StudentDataBase.getAllStudents()
			.stream() // Stream<Student>
		 	.map(Student::getActivities) // Stream<List<String>>
		 	.flatMap(List::stream) // Stream<String>
		 	.distinct() // returns unique activities
		 	.sorted() // sorts activities
		 	.collect(Collectors.toList()); // Stream<List<String>>
		 long endTime = System.currentTimeMillis();
		 System.out.println("[SEQUENTIAL] Execution time: " + (endTime-startTime));
			
		 return studentActivities;
	}
	public static List<String> parallelPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents()
				.stream()
				.parallel()
//				.parallelStream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct() // returns unique activities
				.sorted() // sorts activities
				.collect(Collectors.toList()); // Stream<List<String>>
		long endTime = System.currentTimeMillis();
		 System.out.println("[PARALLEL] Execution time: " + (endTime-startTime));
		
		 return studentActivities;
	}

	public static void main(String[] args) {
		
		//Parallel takes longer
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
		
	}

}
