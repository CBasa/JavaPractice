package week_1_java.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class PredicateStudentExample {
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.8;
	
	public static void filterStudentByGradeLevel() {
		System.out.println("Filter by Grade Level:");
		studentList.forEach((student)->{
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudentByGpa() {
		System.out.println("Filter by Gpa:");
		studentList.forEach((student)->{
			if (p2.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudents() {
		System.out.println("Filter students:");
		studentList.forEach((student)->{
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGpa();
		filterStudents();
	}

}
