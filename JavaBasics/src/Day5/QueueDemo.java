package Day5;

public class QueueDemo {
	
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	public void enQueue(int data) {
		if(!isFull()) {
			
		queue[rear]=data;
		rear=(rear+1)%5; //rear++   //1%5=1 2%5=2 3%5=3 4%5=4 5%5=0 6%5=1 7%5=2 .....
		size=size+1;
		} else {
			System.out.println("Queue is full");
		}
	}
	public int deQueue() {
		int data=queue[front];
		if(!isEmpty()) {
		
		front=(front+1)%5;  //1%5=1 2%5=2 3%5=3 4%5=4 5%5=0 6%5=1 7%5=2 .....
		size=size-1;
		return data;
		}else {
			System.out.println("No more items");
		}
		return data;
	}
	
	public void show() {
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.println(queue[(front+i)%5]+" ");  //1%5=1 2%5=2 3%5=3 4%5=4 5%5=0 6%5=1 7%5=2 .....
		}
	}
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==5;
	}
	
	
	public static void main(String[] args) {
		
	}

}
