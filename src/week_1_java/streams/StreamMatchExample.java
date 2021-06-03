package week_1_java.streams;

import week_1_java.data.StudentDataBase;

// Returns boolean if element matches predicate
public class StreamMatchExample {

	public static boolean allMatch() {

		return StudentDataBase.getAllStudents().stream()
				.allMatch(s -> s.getGpa() >= 3.5);
//			.allMatch(s -> s.getGpa()>=3.8);
	}

	public static boolean anyMatch() {

		return StudentDataBase.getAllStudents().stream()
				.anyMatch(s -> s.getGpa() >= 4.1);
	}
	
	public static boolean noneMatch() {

		return StudentDataBase.getAllStudents().stream()
				.noneMatch(s -> s.getGpa() >= 4.1);
	}

	public static void main(String[] args) {

		System.out.println("Result of All Match: "+allMatch());
		System.out.println("Result of Any Match: "+anyMatch());
		System.out.println("Result of None Match: "+noneMatch());

	}

}
