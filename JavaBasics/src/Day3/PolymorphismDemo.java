package Day3;
/*
 * one action can performed different ways
 * + Operator- numbers - add
 * + Operator - strings - concatination
 * - Compile time polymorphism/static binding/early binding
 *  1. Operator overloading
 *     + - 
 *     20+30 = 50 - add
 *     "Hello"+" World" - "Hello World" - Concat
 *  2. Constructor overloading
 *   Constructor name should match with class name
 *   input arg data type order should be different
 *   no of input args should be different
 *   
 *  3. Method overloading
 *     - can be achieved in same class
 *     - method name should be same
 *     - number of input args should be different
 *     - type of input args should be different
 *     - return type can be same or different
 *     - order of input args should be different
 *     - improve Readability
 *     - int add(n1, n2);
 *     - int add(int n1, int n2, int n3);
 *     - double add(int n1, float n2);
 *     
 *  - Runtime Polymorphism
 */

public class PolymorphismDemo {
	int K; // 0
	final int J=10;
	
	public enum Seasons {WINTER, SUMMER, FALL, SPRING}
	
	public static void main(String[] args) {
		PolymorphismDemo pd=new PolymorphismDemo();
		/*
		 * byte b = 10; // 8 bits
		 * int x = b; // 32 bits - conversion takes place
		 * 
		 * float f = 10.03f;
		 * int y = f;        
		 */
		byte b = 10; 
		int x = b;
		System.out.println(b);
		System.out.println(x);
		
		float f = 10.03f;
		int y = (int)f;
		
		System.out.println(f);
		System.out.println(y);
		
		Employee emp = new Employee();
		Object obj = emp;
		
		//Object obj1 = new Object();
		//Student std = (Student)obj1;
		System.out.println();
		System.out.println(pd.add(10, 30));
		System.out.println(pd.add(10.32f, 10));
		
		int i;
		i=20;
		
		final int J=20; //upper case for constant
		//J=200;
		
		final int K;
		K=300;
		
		
		//ENUM 
		System.out.println(Sizes.SMALL); // SMALL
		System.out.println(Sizes.LARGE); // LARGE
		
		System.out.println();
		for(Sizes e:Sizes.values()) {
			System.out.println(e);
		}
		
		System.out.println();
		Sizes size = Sizes.SMALL;
		switch(size) { // ENUM const, String, char, int, boolean
		case SMALL:
			System.out.println("Selected SMALL size");
			break;
		case MEDIUM:
			System.out.println("Selected MEDIUM size");
			break;
		default:
			System.out.println("Select Valid option");
		}
		
		System.out.println();
		for(Seasons s: Seasons.values()) {
			System.out.println(s);
		}
		
		//Runtime Polymorphism
		B b1 = new B();
		b1.m1();
		b1.m2();
		
		
		System.out.println(b1.m3()); //
		
	}
	
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	int add(int a, double b) {
		return a+(int)b;  // type casting
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	
	

}
