package week_1_java.collections.Queues.PriorityQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<Person> queue	= new PriorityQueue<>(); //initial capacity = 11
		
		queue.add(new Person("Adam", 34));
		queue.add(new Person("Emily", 23));
		queue.add(new Person("Bob", 67));
		queue.add(new Person("Mary", 12));
		queue.add(new Person("Luke", 46));
		
		while (queue.peek()!=null) {
			System.out.println(queue.poll()); 
		}

	}

}
