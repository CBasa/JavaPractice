package week_1_java.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import week_1_java.data.Student;
import week_1_java.data.StudentDataBase;


public class SupplierExample {

	public static void main(String[] args) {

		//takes no input, produces output
		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
		};
		System.out.println(studentSupplier.get());
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		System.out.println(listSupplier.get());
	}

}
