package com.cg.eis.exception;

public class Employee extends Person {
	
	protected int empId;
	protected double salary;
	
    public Employee() {}
	
	public Employee(int empId, double salary) {
		super();
		this.empId=empId;
		this.salary = salary;
	}
	public Employee(String empName, int empId, double salary) {
		super(empName);
		this.empId=empId;
		this.salary = salary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
