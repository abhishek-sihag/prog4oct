package Lab8;
import java.util.*;

class TimerTask implements Runnable{
	@Override
	public void run() {
		if (true) { 
			Thread.currentThread();
        }
        System.out.println(new Date());
	}

	
}

public class Exer2 extends Thread{
	
	
	public static void main(String[] args) {

		
		Timer t= new Timer();
		t.schedule( null, 0, 10000);
		
		
	}

}




//import java.util.*;
//public class Exer2 {
//   public static void main(String []args) {
//      Task t1 = new Task("Task 1");
//      //Task t2 = new Task("Task 2");
//      Timer t = new Timer();
//      t.schedule(t1, 10000); //  executes for every 10 seconds
//      //t.schedule(t2, 1000, 2000); // executes for every 2 seconds
//   }
//}
//class Task extends TimerTask implements Runnable{
//   private String name;
//   public Task(String name) {
//       this.name = name;
//   }
//   public void run() {
//      System.out.println("[" + new Date() + "] " + name + ": task executed!");
//   }
//}
