package Day5;

public class QdemoRunner {
public static void main(String[] args) {
		
	QueueDemo q= new QueueDemo();
	q.enQueue(5);
	q.enQueue(7);
	q.enQueue(9);
	q.enQueue(2);
	q.enQueue(4);
	q.enQueue(8);
	
	
	q.deQueue();
	q.deQueue();
	
	q.enQueue(6);
	System.out.println(q.isEmpty());
	System.out.println(q.isFull());
	System.out.println(q.getSize());
	q.show();
	
	}

}
