package Day7_lambda;
/*
 * Functional Interfaces - interface with single abstract method is called
 *  interface Intf1{
 *    int add(int x, int y);
 *   }
 *
 *  no return type and methods in lambda expression
 *  input arguments & data types also not required 
 */

@FunctionalInterface //method data about this interface
interface Intf1{
	     int add(int x, int y);
	     
	    }

@FunctionalInterface
interface Intf2{
    void greet();
    
   }

@FunctionalInterface
interface Intf3{
	boolean isEven(int x);
}


public class LambdaExpressionDemo {
	public static void main(String[] args) {
		//case 1
		Intf1 a= (x, y) -> x+y;
		System.out.println(a.add(10, 20));//30
		
		//case 2
		Intf2 b= () -> System.out.println("Hello World!");
		b.greet();
		
		//case 3
		Intf3 c= (num) -> {
			if(num%2==0) {
				return true;
			} else
			{
				return false;
			}
		};
		System.out.println(c.isEven(4));
		
		
		
	}
	
//	int add(int x, int y) {
//		return x+y;
//	}
//	void greet() {
//		System.out.println("Hello World!");
//	}
	
//	boolean isEven(int num) {
//		if(num%2==0) {
//			return true;
//		} else
//		{
//			return false;
//		}
//	}
	

}
