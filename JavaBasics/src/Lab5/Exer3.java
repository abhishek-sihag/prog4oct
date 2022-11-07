package Lab5;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Exer3 e=new Exer3();
		try {
			e.m1();
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
	}
	void m1() throws EmployeeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		if(salary<3000) {
			throw new EmployeeException("Acceptable salary is 3000 but you entered: "+salary);
		}else {
			System.out.println("Salary is: "+salary);
		}
	}
	
	public class EmployeeException extends Exception{
		EmployeeException(String msg){
			super(msg);
		}
	}

}
