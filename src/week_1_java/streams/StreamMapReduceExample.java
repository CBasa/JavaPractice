package week_1_java.streams;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int totalNotebooks() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
			.filter(s->s.getGradeLevel()>=3)
			.filter(s->s.getGender().equals("female"))
			.map(Student::getNotebooks) //Stream<Integer>
//			.reduce(0,(a,b)->a+b); for summation you can use 0 as identity
			.reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		
		System.out.println("Number of notebooks: "+totalNotebooks());
	}

}
