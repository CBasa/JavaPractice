package week_1_java.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;

public class StreamGroupingByExample {
	
	public static void groupStudentsByGender() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	public static void customizedGroupingBy() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student->student.getGpa()>=3.9? "Good" : "Average"));
		
		System.out.println(studentMap);
	}
	
	public static void twoLevelGrouping_1() {
		Map<String, Map<Integer, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(student->student.getGpa()>=3.9? "Good" : "Average", 
					Collectors.groupingBy(Student::getGradeLevel)));
	
		System.out.println(studentMap);
	}
	
	public static void twoLevelGrouping_2() {
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, 
						Collectors.summingInt(s->s.getActivities().size())));
		
		System.out.println(studentMap);
	}
	
	public static void threeArgGroupBy() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap =  StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(
					Student::getGender, 
					LinkedHashMap::new, 
					Collectors.toSet()));
	
		System.out.println(studentLinkedHashMap);
	}
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> topGpaOptional = StudentDataBase.getAllStudents().stream()			
				.collect(Collectors.groupingBy(
						Student::getGradeLevel, 
						Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		// collectingAndThen used to get value of Optional
		Map<Integer, Student> topGpa = StudentDataBase.getAllStudents().stream()			
			.collect(Collectors.groupingBy(
					Student::getGradeLevel, 
					Collectors.collectingAndThen(
							Collectors.maxBy(Comparator.comparing(Student::getGpa)), 
							Optional::get)));
		
		System.out.println(topGpa);
	}
	
	public static void calculateLeastGpa() {
		Map<Integer, Student> leastGpa = StudentDataBase.getAllStudents().stream()			// collectingAndThen used to get value of Optional
			.collect(Collectors.groupingBy(
					Student::getGradeLevel, 
					Collectors.collectingAndThen(
							Collectors.minBy(Comparator.comparing(Student::getGpa)), 
							Optional::get)));
		
		System.out.println(leastGpa);
	}
	
	public static void main(String[] args) {
//		groupStudentsByGender();
//		customizedGroupingBy();
//		twoLevelGrouping_1();
//		twoLevelGrouping_2();
//		threeArgGroupBy();
//		calculateTopGpa();
		calculateLeastGpa();
	}

}
