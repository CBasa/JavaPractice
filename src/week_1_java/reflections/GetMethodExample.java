package week_1_java.reflections;

import java.lang.reflect.Method;

public class GetMethodExample {

	public static void main(String[] args) {

		Method[] methods = Person.class.getMethods();

		for (Method i:methods) {
			System.out.println(i.getName()+", return type: "+i.getReturnType());
		}
		
	// Methods not specified but are included because every class extends Object
//				wait, return type: void
//				wait, return type: void
//				wait, return type: void
//				equals, return type: boolean
//				toString, return type: class java.lang.String
//				hashCode, return type: int
//				getClass, return type: class java.lang.Class
//				notify, return type: void
//				notifyAll, return type: void

	}

}
