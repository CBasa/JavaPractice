package week_1_java.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {
		// BEFORE
//		List<String> namesList = StudentDataBase.getAllStudents().stream()
//				.map(Student::getName)
//				.collect(Collectors.toList());
		
		List<String> namesList = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.mapping(
					Student::getName, 
					Collectors.toList()));
		
		System.out.println("Name List: " + namesList);
		
		Set<String> namesSet = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(
						Student::getName, 
						Collectors.toSet()));
		
		System.out.println("Name Set: " + namesSet);
	}

}
