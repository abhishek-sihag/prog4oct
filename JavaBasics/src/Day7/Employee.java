package Day7;



public class Employee implements Comparable<Employee> {

	// Fields
	int empId;
	String empName;
	double salary;
	
	// Constructors
	//no args constructor
	public Employee() {
		//logic
		System.out.println("Created :");
	}
	
	//parameterised constructor
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary=salary;
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		
	}
	public Employee(String empName) {
		super();
		this.empName=empName;
	}



	// Getters&Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return  empId + " : " + empName + " : " + salary ;
	}

	@Override
	public int compareTo(Employee o) {
		//based on empName
		return this.empName.compareTo(o.empName);
		
		
		//sort based on empName - asc
		//return this.empName.compareTo(o.empName);
		
		//sort based on empId
//		if(this.empId>o.empId) {
//			return 1;
//		}else if(this.empId<o.empId) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		//or
		
		//return this.empId>o.empId?100:this.empId<o.empId?-100;
	}
	


	
}