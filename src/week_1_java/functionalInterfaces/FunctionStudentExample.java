package week_1_java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
		Map<String, Double> studentGpaMap = new HashMap<>();
		
		students.forEach((student)->{
			if(PredicateAndConsumerExample.b2.test(student.getGradeLevel(),student.getGpa())) {
				studentGpaMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGpaMap;
	};

	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}

}
