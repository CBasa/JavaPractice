package week_1_java.methodReferences;

import java.util.function.Predicate;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class RefactorMethodReferenceExample {

//  ORIGINAL:
//	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	
	static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel (Student s) {
		return s.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

	}

}
