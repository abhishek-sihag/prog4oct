package Day1;

public class Test {

	public static void main(String[] args) {
		
		// create object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Basics b1 = new Basics();
		

		
		// calling non-static members
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.salary);
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.salary);
		
		System.out.println(b1.id);
		System.out.println(b1.name);
		System.out.println(b1.add(10, 10));
		b1.m1();
		
		// calling static members
		// using object reference
		System.out.println(b1.companyName);
		b1.m2();
		
		// using class name
		System.out.println(Basics.companyName);
		Basics.m2();
		
		System.out.println(emp1); //day1.Employee@123a439b
		System.out.println(emp2); //day1.Employee@7de26db8
		
		emp1.setEmpId(1001);
		emp1.setEmpName("Ram");
		emp1.setSalary(55000);
		
		emp2.setEmpId(1002);
		emp2.setEmpName("Sam");
		emp2.setSalary(65000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getSalary());
		
		Employee emp3 = new Employee("Ravi");
		System.out.println(emp3);
		//Employee emp4 = new Employee(1003);
		Employee emp4 = new Employee(1004,"Ravi");
		System.out.println(emp4);
		Employee emp5 = new Employee(1005,"Ravi", 45000);
		System.out.println(emp5);
		
		emp3.setSalary(50000);
		emp3.setEmpId(1003);
		
		System.out.println(emp3);
	}

}