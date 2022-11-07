package Day8;
/*
 *Multitaksing 
 * Multiprocessing -
 *  Working with multiple application at the same time 
 *    ex: notepad, mp3 player
 *  OS Specific
 *  Each process requires its own memory
 *                 
 * Multithreading - 
 *  One application - many independent tasks performing simultaneously
 *  all tasks are independent each other.
 *  ex: Gaming applications, animations, sending web requests to servers, 
 *  advantage - improves performance
 *  memory shared by all threads
 *  inter-thread communication will be faster 
 *    wait(), notify(), notifyAll()
 *    
 *  Thread Life cycle / states:
 *    New - new keyword - When thread is instantiated, then state of the thread is in New state
 *    Runnable - start() - state of thread will be Runnable 
 *    Running - Once thread scheduler allocates resources
 *    blocked/Timed Waiting - wait(), yield(), suspend(), join()
 *        - blocked to runnable state - resume(), notify() & notifyAll()
 *    Dead/Terminate - execution of run() is over. 
 *                   - other threads interrupted current thread execution 
 *                   
 *                   
 * Ways to create threads
 *  2 ways
 *   1. Implementing Runnable interface
 *      step 1: Create class that should implements Runnable interface
 *      step 2: implement void run() 
 *      step 3: Create Thread object using Runnable interface obj.
 *      step 4: call start() method 
 *                    - register thread with thread scheduler
 *                    - calls run() method 
 *                     
 *   2. Extending Thread class (pkg - java.lang)
 *       step 1: Create class that should extends Thread class
 *       step 2: Override run() method of thread class
 *       step 3: Create Thread class object
 *       step 4: call start() method
 */

public class MultithreadDemo {
	


	public static void main(String[] args) {
		MyThread t1=new MyThread(); //New
		
		MyThread t2= new MyThread();
		//set name to thread
		t1.setName("t1");
		t2.setName("t2");
		
		
		
		//get active thread count
		//System.out.println(Thread.activeCount());//3
		
		//priority
//		System.out.println("Thread priority: ");
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(t1.getPriority());//5
//		System.out.println(t2.getPriority());//5
		
		//set priority
//		Thread.currentThread().setPriority(10); // only 1 to 10
//		t1.setPriority(1);
		//
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);//10
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.NORM_PRIORITY);//5
		
		//call start method to register with thread scheduler
		t1.start(); //Runnable
		t2.start();
		
		System.out.println("Thread priority: ");
		System.out.println(Thread.currentThread().getPriority());//10
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		
//		//get t1 thteadgroup name
//		System.out.println("t1 thread group name: ");
//		System.out.println(t1.getThreadGroup().getName()); //main
//		System.out.println("t2 thread group name: ");
//		System.out.println(t2.getThreadGroup().getName()); //main
//		System.out.println();
//		System.out.println("main thread treadgroup name : ");
//		System.out.println(Thread.currentThread().getThreadGroup());
//		System.out.println();
		
		//isAlive()
//		System.out.println("isAlive() ?: ");
//		System.out.println("mai isAlive(): "+Thread.currentThread().isAlive());//true
//		System.out.println("t1 isAlive(): "+t1.isAlive());//true
//		System.out.println("t2 isAlive(): "+t2.isAlive());//true
		
		
//		//join
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		//get main threadgroup
//		System.out.println("main thread treadgroup name : ");
//		System.out.println(Thread.currentThread().getThreadGroup());
//		System.out.println(t1.getThreadGroup());
//		
//		
		//t1.run();   //invalid
		
		//isAlive()
//		System.out.println("isAlive() ?: ");
//		System.out.println("mai isAlive(): "+Thread.currentThread().isAlive());//true
//		System.out.println("t1 isAlive(): "+t1.isAlive());//false
//		System.out.println("t2 isAlive(): "+t2.isAlive());//falses
				
		for(int i=0;i<10;i++) {
			
			//System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	} //main

}
