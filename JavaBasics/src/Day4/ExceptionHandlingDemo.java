package Day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Exception Handling
 * Abnormal condition that distrubs normal flow of execution
 * 
 * ArrayIndexOutOfBoundsException
 * StringIndexOutOfBoundsException
 * FileNotFoundException
 * IOException
 * NumberFormatException
 * IllegalExpressionException
 * NullPointerException
 * ArithmeticException
 * 
 * Throwable(C)  - Exception(C)
 *                 - SQLException
 *                 - IOException
 *                 - ClassNotFoundException
 *                 - RuntimeException(C)
 *                    - ArithmeticException
 *                    - IndexOutofBoundsException
 *                         - ArrayIndexOutofBoundsException
 *                         - StringIndexOutofBoundsException
 *        
 *            - Error
 *               - OutOfMemoryError
 *               - StackOverflowError
 *               - VirtualMachineError
 *               
 *    try {
 *    	// risk code
 *    } catch {
 *    
 *    }
 *    
 *    try, catch, finally, throw, throws, custom exceptions
 */

public class ExceptionHandlingDemo {
	int x;//0
	String str;//null //non static
	String std;//null
	
	
	static Employee emp; // null
	BufferedReader br;

	public static void main(String[] args) throws InvalidAgeException {
		
		
		
		ExceptionHandlingDemo ed = new ExceptionHandlingDemo();
		try {
		String str = "Hello World"; // local
		//System.out.println(str.charAt(str.length()));//StringIndexOutofBoundException
		System.out.println(str.charAt(str.length()-1));
		
		//System.out.println(10/0); //ArthimeticException
		System.out.println(10/2);
		
		int[] intArr = new int[] {10,20,30};
		//System.out.println(intArr[intArr.length]);// ArrayIndexOutOfBoundsException
		System.out.println(intArr[intArr.length-1]);
		
		//System.out.println(emp.getSalary()); //NullPointerException
		emp = new Employee(25000.0,1011);
		System.out.println(emp.getSalary());
		
		//System.out.println(ed.str.length()); //NullPointerException
		ed.str ="Hello";
		
		System.out.println(ed.str.length());//5
		
		//converting from string to integer object
		
		Integer i = new Integer("10");
		System.out.println(i); // 10
		
		
		Integer i1 = new Integer("abc");
		System.out.println(i1); // NumberFormatException
		
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(NullPointerException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//case 2
		try {
			System.out.println(10 / 2);
			System.out.println(emp.getSalary());
		}catch(ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}
		
		//case 3
		try {
			System.out.println(10 / 2);
			System.out.println(emp.getSalary());
		}catch(ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block code");
		}
		
		
		
		//throw/throws example
		try {
		ed.m1();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//compile time error
		try {
			ed.br = new BufferedReader(new FileReader("abc.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ed.br!=null) {
					ed.br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		try {
			ed.br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Out of try block");
		
	} //main
		
	void m1() throws ArrayIndexOutOfBoundsException{
		
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
	void m2() throws InvalidAgeException, ArrayIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age<5) {
			throw new InvalidAgeException("Age should be greater than 10");
		}
		m3();
		
	}
	void m3() throws ArrayIndexOutOfBoundsException {
		int[] i = {10,20,30};
		System.out.println(i[3]); // ArrayIndexOutOfBoundsException
	}
	
	

}//class
