package week_1_java.collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue	= new LinkedList<>();
		
		//FIFO - first in, first out
		System.out.println(queue.add("Adam"));// throws exception if no space available
		System.out.println(queue.offer("Kevin")); //returns false if no space available
		queue.add("Anna");
		queue.add("David"); 
		queue.add("Jenny");
		
		queue.forEach(System.out::println);
		
		System.out.println("Element: "+queue.element()); //returns head of queue (first item) and throws exception if empty
		System.out.println("Peek: "+queue.peek()); //returns head of queue and returns null if empty
		
		System.out.println("Remove: "+queue.remove()); //returns and removes head of queue and throws exception if empty
		System.out.println("Remove: "+queue.poll()); //returns and removes head of queue and returns null if empty
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
		System.out.println(queue.poll()); //returns null
		
	}

}
