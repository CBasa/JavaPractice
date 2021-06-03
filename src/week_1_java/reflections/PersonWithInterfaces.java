package week_1_java.reflections;

import java.io.Serializable;

public class PersonWithInterfaces implements Comparable<PersonWithInterfaces>,Serializable{

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
	public String returnName() {
		return this.name+" is the name";
	}
	@Override
	public int compareTo(PersonWithInterfaces o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
