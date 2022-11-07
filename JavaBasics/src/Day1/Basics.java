package Day1;

import java.util.Scanner;

/*
 * class/interface - UpperCamelCase
 * methods/variables - lowerCamelCase
 * packages - lowercase
 * constants - UPPERCASE
 * 
 * Name of the class/interface file should start with alphabets,_,$
 * 
 * No restriction on length
 * Give meaningful names for classes, interfaces, variables and methods 
 * Give the appropriate comments where ever required
 * Don't use keywords as method/class/variable/interface names
 *   static, public, final, return, super....
 *   
 *   

 *   
 * Order
 *  pkg statment
 *  import statement
 *  class declaration
 *     variables
 *       static variables
 *       non static variables
 *       local methods
 *     constructors
 *     getters/setter methods
 *     toString() 
 *  comments can write any where
 *  
 *  Data types:
 *   primitive data types(8)
 *    byte -0
 *    short -0
 *    int -0
 *    long -0
 *    
 *    float - 0.0f
 *    double - 0.0
 *    
 *    char - 'r' - '/u000'
 *    boolean - true/false - false
 *    
 *   non-primitive data types
 *     String, Array
 *  
 *  static/non static blocks
 *  
 *  - access modifiers
 *  public, default, protected & private 
 *  
 *  
 */

// Single line comment
/*
 * Multi
 * line 
 * comment
 */
//Identifiers
//===========
//fred
//if
//2x 
//-4
//sum_total
//sumTotal
//sum-total
//sum total
//sum.total
//While
//x2
//Private
//public
//$16
//xTwo
//_static
//_4
//___
//10%
//a27834
//wilma�s

//Operators
//============
//Unary Operator
// postfix - expr++ expr--
//  int x= 10;
//  x++ ;//10
//  x ;//11
// prefix  - ++expr --expr
// int y = 10;
// ++y ;// 11
//Arithmetic Operator
// + - * / %
//
//Shift Operator
// << >>
//
//Relational Operator
// == != < > <= >= instanceof 
//
//Bitwise Operator
//  & - AND
//  ^ - Bitwise exclusive OR
//  | - Bitwise inclusive OR
//  
//Logical Operator
//  && - Logical AND
//  || - Logical OR
//  
//Ternary Operator
//  ? :
//Assignment Operator.
//  = += -= *= /= %= &= ^= |= <<= >>=

 
//Control statements
//===================
//Decision Making statements
//  if statements
//     if() {
//		// code
//     } else if(){
//       // code
//     } else if() {
//       //code
//     } else {
//       // code
//     }
//  switch statement
//    switch(expr) {
//	     case 1: 
//           // code
//           break;
// 	     case 2:
//            // code
//            break;
//	     default:
//            // code;
//    }
//Loop statements
//  do while 
//  while 
//  for 
//  for-each
//Jump statements
//  break statement
//  continue statement

public class Basics {

	// non static variables
	int id;
	String name;
	
	// static variables
	static String companyName = "ABC Company";
	
	
	// Constructor
	// no arg constructor/default constructor
	Basics(){
		System.out.println("default constructor");
	}
	
	// parameterized constructor
	Basics(int id) {
		this.id=id;
	}
	Basics(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		int x= 10; // local variables
		System.out.println(x+++2);//12
		System.out.println(x);//11
		int y = 10;
		System.out.println(++y+2);//13
		
		Employee emp5 = new Employee();
		Basics b5 = new Basics();
		System.out.println(emp5 instanceof Employee); //true
		
		System.out.println(x>5?true:false);
		
//		int sum = 0;
//		sum = sum+1;
//		sum-=1;
//		
		
		System.out.println(b5.isEven(111245));
		
		System.out.println();
		System.out.println(b5.isLeap(2000));// true
		System.out.println(b5.isLeap(2005)); // false
		
		// Array -
		// one dimensional array
		// Multidimentional array
		
		// One dimensional array
		// creating an array
		// Case 1
		String[] colors = {"red", "orange", "green"};
		
		System.out.println();
		// read
		System.out.println(colors[2]); // "green"
		System.out.println();
		
		// for
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i]); // red, orange, green
		}
		
		System.out.println();
		// for-each
		for(String color:colors) {
			System.out.println(color);
		}
		
		// while
		int indx =0;
		while(indx<colors.length) {
			System.out.println(colors[indx]);//red, orange, green
			indx++;
		}
		
		
		// Case 2
		int[] numArr = new int[5];
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		numArr[3]=40;
		numArr[4]=50;
		
		System.out.println();
		for(int num:numArr) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		// case 3:
		char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
		for(char ch:charArr) {
			System.out.print(ch+" ");
		}
		
		charArr[0]='H';
		
		System.out.println();
		for(int i=0;i<charArr.length;i++) {
			System.out.print(charArr[i]+" "); // 'H', 'e', 'l', 'l', 'o'
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrSize = sc.nextInt();
		int[] numArr1 = new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			System.out.println("Enter number:");
			numArr1[i]=sc.nextInt();
		}
		
		for(int num:numArr1 ) {
			System.out.print(num+" ");
		}
		
		
		// switch
		System.out.println();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter any number between 1 to 12");
		int m = sc1.nextInt();
		switch(m) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		default:
			System.out.println("Enter valid number between 1 to 12");
		}
		
		
		
		
		
		/*
		// create obj
		Basics basics= new Basics();
		
		// Accessing non static members from static area
		//System.out.println(id);
		//m1();
		System.out.println(basics.id);
		basics.m1();
		
		// Accessing static members from static area
		// calling static member directly
		System.out.println(companyName);
		m2();
		
		// using class name
		System.out.println(Basics.companyName);
		Basics.m2();
		
		// using obj ref
		System.out.println(basics.companyName);
		basics.m2();
		
		*/
		
	}
	void m1() {
		System.out.println("m1 method");
		// accessing non static and static members from non static area
		add(10,20);
		m2();
		System.out.println(id);
		System.out.println(companyName);
		
	}
	int add(int n1, int n2){
		int result = n1+n2; // local variable
		return result;
	}
	static void m2() {
		System.out.println("m2 method");
	}

	// non static block
	{
		System.out.println("Non static block");
	}
	// static block
	static {
		System.out.println("Static block");
	}
	
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isLeap(int year) {
		if(year%100==0) {
			if(year%400==0) {
				if(year%4==0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}