package week_1_java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class BifunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students,studentPredicate) -> {
		Map<String, Double> studentGpaMap = new HashMap<>();
		
		students.forEach((student)->{
			if(studentPredicate.test(student)) {
				studentGpaMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGpaMap;
		
	};
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateAndConsumerExample.p1));
	}

}
