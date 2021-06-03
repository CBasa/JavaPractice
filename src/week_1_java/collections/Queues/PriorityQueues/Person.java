package week_1_java.collections.Queues.PriorityQueues;

//NEED TO SPECIFY PRIORITY THROUGH IMPLENTATION OF COMPARABLE INTERFACE
public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
//	public int compareTo(Person otherPerson) {
//		return -Integer.compare(this.age, otherPerson.getAge()); //reverse order by putting negative sign in front
//	}
	public int compareTo(Person otherPerson) {
		return -this.name.compareTo(otherPerson.getName()); //reverse order by putting negative sign in front
	}

}
