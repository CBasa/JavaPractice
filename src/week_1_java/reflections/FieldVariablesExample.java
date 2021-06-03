package week_1_java.reflections;

import java.lang.reflect.Field;

public class FieldVariablesExample {

	public static void main(String[] args) {

		Class<Person> personClass = Person.class;
		
		System.out.println(personClass.getPackage());
		
//		Field[] fields = personClass.getFields();
		Field[] fields = personClass.getDeclaredFields(); //declared includes fields with protected, private and default modifier
		
		for (Field i:fields) {
//			i.setAccessible(true);
			System.out.println(i.getName());
		}

	}

}
