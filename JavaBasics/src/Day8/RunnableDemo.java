package Day8;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class RunnableDemo {
	
	public static void main(String[] args) {
		// create Runnable object
		MyThread2 mt1= new MyThread2();
		// Create thread using Runnable object
		Thread t1=new Thread(mt1);
		
		MyThread2 mt2= new MyThread2();
		Thread t2=new Thread(mt2);
		
		//start the thread
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

}
