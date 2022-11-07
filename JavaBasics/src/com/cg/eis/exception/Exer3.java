package com.cg.eis.exception;



public class Exer3 extends Employee {
	
	static Employee emp;
	public static void main(String[] args) {
		Exer3 e=new Exer3();
		try {
			e.m1();
		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	void m1() throws EmployeeException{
		emp = new Employee(30,3000.0);
		emp = new Employee(40,2500.0);
		emp = new Employee(50,5000.0);
		emp = new Employee(60,2900.0);
		
		if(salary<=3000.0) {
			throw new EmployeeException("Salary is less than 3000");
		}else {
			System.out.println(empId+salary);
		}
		
	}

}
