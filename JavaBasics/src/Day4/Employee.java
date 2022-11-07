package Day4;

import java.time.LocalDate;

public class Employee extends Person {

	// Fields
	private int empId;
	private double salary;
	
	// Constructors
	public Employee() {}
	
	public Employee( double salary, int empId) {
		super();
		this.empId = empId;
		this.salary = salary;
	}
	
	public Employee(int empId, double salary, String firstName, String lastName, LocalDate dob, Address address) {
		super(firstName, lastName, dob, address);
		this.empId = empId;
		this.salary = salary;
	}
	// Getters&Setters
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + ", Dob=" + getDob() + ", Address=" + getAddress()
				+ "]";
	}

	
}