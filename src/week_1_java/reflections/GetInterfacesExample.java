package week_1_java.reflections;

public class GetInterfacesExample {

	public static void main(String[] args) {

		Class<PersonWithInterfaces> personClass = PersonWithInterfaces.class;
		
		Class[] interfaces = personClass.getInterfaces();
		
		for (Class c:interfaces) {
			System.out.println(c.getName());
		}

	}

}
