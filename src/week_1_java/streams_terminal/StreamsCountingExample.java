package week_1_java.streams_terminal;

import java.util.stream.Collectors;

import week_1_java.data.StudentDataBase;

public class StreamsCountingExample {
	
	public static long count() {
		
		return StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGender().equals("female"))
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		
		System.out.println(count());
	}

}
