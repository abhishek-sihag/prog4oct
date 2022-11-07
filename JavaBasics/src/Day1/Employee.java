package Day1;

public class Employee {
	 int empId; //0
	 String empName; //null
	 double salary; //0.0
	
	
	//Constructor
	// No arg constructor
	public Employee() {
		//logic
		System.out.println("Created employee obj");
	}
	
	//parameterized constructor
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	public Employee(String empName) {
		super();
		this.empName = empName;
	}


	// getters
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpId(int id) {
		this.empId=id;
	}
	
	public String getEmpName(){
		return empName;
	}
	void setEmpName(String name) {
		this.empName=name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empId+" : "+empName+ " : "+salary;
	}
	
	
}