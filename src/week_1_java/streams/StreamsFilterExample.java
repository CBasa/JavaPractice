package week_1_java.streams;

import java.util.List;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class StreamsFilterExample {

	public static List<Student> filterStudents() {
		List<Student> filteredStudents = StudentDataBase.getAllStudents()
			.stream()
//			.filter(s -> s.getGender()=="female")  -different syntax also works
			.filter(s->s.getGender().equals("female"))
//			.filter(s->s.getActivities().contains("dancing"))
			.collect(Collectors.toList());
		return filteredStudents;
	}
	
	public static void main(String[] args) {
		
		filterStudents().forEach(System.out::println);
		
	}

}
