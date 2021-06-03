package week_1_java.methodReferences;

import java.util.function.Consumer;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class ConsumerMethodReference {
	
	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListOfActivities;

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);

	}

}
