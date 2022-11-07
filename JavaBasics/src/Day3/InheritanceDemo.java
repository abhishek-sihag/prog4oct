package Day3;

import java.time.LocalDate;

/*
 * Inheritance types
 *  Single  - Java supports
 *  Multiple
 *  MultiLevel - Java supports
 *  Hierarchical - Java supports
 *  Hybrid
 *  
 *  IS-A Relationship
 */
public class InheritanceDemo {

	public static void main(String[] args) {

		// IS-A relationship example
		Person person = new Person();
		person.setDob(null);
		person.setFirstName(null);
		person.setLastName(null);
		person.getDob();
		person.getFirstName();
		person.getLastName();
		
		//Student std1  = new Student();
		Student std2  = new Student(201, "Ram", "K", LocalDate.of(2000, 05, 21));
		
		System.out.println();
		System.out.println(std2.getRollNo());
		System.out.println(std2.getFirstName());
		System.out.println(std2.getLastName());
		System.out.println(std2.getDob());
		
		Employee emp1 = new Employee(1001, 55000.0, "Sam", "R", LocalDate.of(1990, 03, 29), null);
		System.out.println();
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getLastName());
		System.out.println(emp1.getDob());
		System.out.println(emp1.getSalary());
		
		// Has-A relationship example
		Address address = new Address("123C", "TNagar", "Chennai", "Tamilnadu");
		Employee emp2 = new Employee(1002, 45000.0, "Ravi", "S", LocalDate.of(1991, 03, 29), address);
		
		System.out.println(emp2);// pkg.className@hashcode
		
		System.out.println(emp2.getFirstName()); // Ravi
		System.out.println(emp2.getAddress().getCity()); // Chennai
		System.out.println(emp2.getAddress().getState()); // Tamilnadu
		System.out.println(); // ctrl+space
		
		
		// Multi level inheritance
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println();
		System.out.println(a.x);
		System.out.println(a.y);
		a.m1();
		
		System.out.println();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m2();
		b.m1();
		
		System.out.println();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println("=================");
		// Hierarchical
		A a1 = new A();
		B b1 = new B();
		D d1 = new D();
		
		
		System.out.println();
		System.out.println(a1.x);
		System.out.println(a1.y);
		a1.m1();
		
		System.out.println();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m2();
		b1.m1();
		
		
		System.out.println();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.m4();
		d1.m1();
		
		
		
	}

}