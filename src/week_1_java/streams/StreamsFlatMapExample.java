package week_1_java.streams;

import java.util.List;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {
		 List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
		 	.map(Student::getActivities) // Stream<List<String>>
		 	.flatMap(List::stream) // Stream<String>
		 	.distinct() // returns unique activities
		 	.sorted() // sorts activities
		 	.collect(Collectors.toList()); // Stream<List<String>>
			
		 return studentActivities;
	}
	
	public static long getStudentActivitiesCount() {
		long activitiesCount = StudentDataBase.getAllStudents().stream() // Stream<Student>
		 	.map(Student::getActivities) // Stream<List<String>>
		 	.flatMap(List::stream) // Stream<String>
		 	.distinct() // returns unique activities
		 	.count(); // <long>
			
		 return activitiesCount;
	}
	
	public static void main(String[] args) {
		
		System.out.println("List of activities: "+printStudentActivities());
		System.out.println("Number of activities: "+getStudentActivitiesCount());

	}

}
