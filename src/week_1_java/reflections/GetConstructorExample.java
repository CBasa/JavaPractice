package week_1_java.reflections;

import java.lang.reflect.Constructor;

public class GetConstructorExample {

	public static void main(String[] args) throws Exception {

		Constructor<Test> constructor = Test.class.getDeclaredConstructor();
		
//		Test t = new Test();  //cannot instantiate if constructor is private
		
		//can instantiate a class with reflection even if the constructor is private
		constructor.setAccessible(true);
		Test test = constructor.newInstance();
		Test test2 = constructor.newInstance();
		Test test3 = constructor.newInstance(); //multiple instances created (against Singleton pattern)
		System.out.println(test);
//		System.out.println(t);

	}

}

