package week_1_java.reflections;

import week_1_java.customAnnotations.CustomAnnotation;

public class Person extends Employee {
	
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
	
	@CustomAnnotation(name = "myAnnotation")
	public String returnName() {
		return this.name+" is the name";
	}
}
