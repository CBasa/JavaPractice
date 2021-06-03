package week_1_java.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class ConsumerExample {
	
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	//takes an input, produces no output
	static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student);
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
	
	public static void printName() {
		studentList.forEach(c2);
	}
	public static void printStudents() {
		studentList.forEach(c3);
	}
	
	public static void printNameAndActivities() {
		studentList.forEach(c2.andThen(c4)); //consumer chaining
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		studentList.forEach((student)->{
			if (student.getGradeLevel()>= 3 && student.getGpa()>=3.9) {
				c2.andThen(c4).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		
//		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
//		c1.accept("hello");
		
//		printName();
//		printStudents();
//		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}

}
