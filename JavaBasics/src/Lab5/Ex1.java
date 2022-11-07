package Lab5;

import java.util.Scanner;


public class Ex1 {
	
	public static void main(String[] args) throws InvalidFullNameException {
		//Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
		
		Ex1 hand=new Ex1();
		
		try {
			hand.m1();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	void m1() throws InvalidAgeException, InvalidFullNameException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age<15) {
			throw new InvalidAgeException("Age of a person should be above 15 but here: "+age);
		}
		
	}
	
	


}

