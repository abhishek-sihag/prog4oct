package Day5;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack nums= new Stack();
		nums.push(15);
		nums.push(8);
		nums.push(9);
		nums.push(84);
		System.out.println(nums);
		
		nums.push(84);
		System.out.println(nums);
		nums.push(845);
		System.out.println(nums);
		nums.push(848);
		nums.push(8458);
		//System.out.println(nums.peek());
		//nums.push(18); //stack size donot exceed
		
		//System.out.println(nums.pop());
		System.out.println("Size: "+nums.size());
		
		System.out.println("Empty? : "+nums.isEmpty());
		//nums.show();
		System.out.println(nums);
	}



	
}
