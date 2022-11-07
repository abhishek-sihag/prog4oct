package Day5;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer("A");
		pq.offer("C");
		pq.offer("D");
		pq.offer("B");
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

	}

}
