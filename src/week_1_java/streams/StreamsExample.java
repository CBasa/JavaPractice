package week_1_java.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
		Predicate<Student> p2 = student -> student.getGpa()>=3.8;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
			.peek((student)->{
				System.out.println(student); //use peek to help debug streams
			})
			.filter(p1)	
			.peek((student)->{
				System.out.println("After first filter: "+student);
			})
			.filter(p2)
			.peek((student)->{
				System.out.println("After second filter: "+student);
			})
			.collect(Collectors.toMap(Student::getName, Student::getActivities)); //collect starts the stream

		System.out.println(studentMap);
	}

}
