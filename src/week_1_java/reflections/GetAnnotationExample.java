package week_1_java.reflections;

import java.lang.reflect.Method;

import week_1_java.customAnnotations.CustomAnnotation;

public class GetAnnotationExample {

	public static void main(String[] args) {

		Class<Person> personClass = Person.class;
		
		Method[] methods = personClass.getMethods();
		
		for (Method i:methods) {
			if (i.isAnnotationPresent(CustomAnnotation.class)) {
				System.out.println(i.getName());
			}
		}

	}

}
