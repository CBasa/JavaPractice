package week_1_java.collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

//DEQUE - Double-ended queue
//can manipulate first and last elements
public class ArrayDequeExample {

	public static void main(String[] args) {

		Deque<Integer> queue = new ArrayDeque<>(); //initial capacity 16
		
		queue.offer(10);
		queue.offer(10);
		queue.offer(100);
		queue.offer(1000);
		queue.push(2);
		queue.push(3); //pushes an element to the head of the stack
		queue.offer(16);
		System.out.println(queue.peek()); //returns the element at the head of the stack/element last pushed to stack
		System.out.println(queue);
		System.out.println(queue.pop()); //removes the element at the head of the stack/element last pushed to stack
		System.out.println(queue);
		
//		while(!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}

	}

}
