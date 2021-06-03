package week_1_java.collections.Queues;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("size: "+stack.size());
//		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println("size: "+stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
