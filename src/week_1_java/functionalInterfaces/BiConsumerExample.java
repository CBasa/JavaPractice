package week_1_java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class BiConsumerExample {
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void nameAndActivities() {
		BiConsumer<String, List<String>> c1 = (name,activities) -> System.out.println(name+": "+activities);
	
		studentList.forEach(student->c1.accept(student.getName(),student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println("a: " + a + "\nb: " + b);
		};
		biConsumer.accept("hello", "world");
		
		BiConsumer<Integer, Integer> multiply = (a,b) -> {
			System.out.println("Multiplication: " + a*b);
		};
		
		BiConsumer<Integer, Integer> divide = (a,b) -> {
			System.out.println("Division: " + a/b);
		};

		BiConsumer<Integer, Integer> add = (a,b) -> {
			System.out.println("Addition: " + (a+b));
		};
		
		BiConsumer<Integer, Integer> subtract = (a,b) -> {
			System.out.println("Subtraction: " + (a-b));
		};
		
		multiply.andThen(add).andThen(subtract).andThen(divide).accept(12, 4);
		
		nameAndActivities();
	
		
	}
}
