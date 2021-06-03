package week_1_java.reflections;

public class GetClassExample {
	
	//takes in a vehicle and checks which implementation it is
	public static void checkClass(Vehicle vehicle) {
		Class c = vehicle.getClass();
		System.out.println(c.getName());
	}

	public static void main(String[] args) {
		
		//GET CLASS
		Class<Person> c = Person.class;
		System.out.println(c.getName());
		
		Class personClass = null;
		
		try {
			personClass = Class.forName("week_1_java.collections.Queues.PriorityQueues.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(personClass);
		
		checkClass(new Bus());

	}

}
