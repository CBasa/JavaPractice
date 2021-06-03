package week_1_java.reflections;

public class GetSuperClassExample {

	public static void main(String[] args) {

		Class<Person> personClass = Person.class;
		
		System.out.println(personClass.getSuperclass().getName());

	}

}
