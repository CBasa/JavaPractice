package week_1_java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class PredicateAndConsumerExample {
	static List<Student> studentList = StudentDataBase.getAllStudents();

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.8;
	
	//Combine p1 and p2 into BiPredicate
	static BiPredicate<Integer, Double> b2 = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.8;

	BiConsumer<String, List<String>> b1 = (name,activities) -> System.out.println(name+": "+activities);
	
	Consumer<Student> c1 = (s) -> {
		if(p1.and(p2).test(s)) {
			b1.accept(s.getName(), s.getActivities());
		}
	};
	
	Consumer<Student> c2 = (s) -> {
		if(b2.test(s.getGradeLevel(),s.getGpa())) {
			b1.accept(s.getName(), s.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {
		students.forEach((s)->{
			c2.accept(s);
		});
	}

	public static void main(String[] args) {
		new PredicateAndConsumerExample().printNameAndActivities(studentList);
	}

}
