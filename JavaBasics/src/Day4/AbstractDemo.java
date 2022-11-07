package Day4;

public class AbstractDemo {
	public static void main(String[] args) {
		
		//A  a =new A();
		//B  b =new B();
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		System.out.println(c.i);
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		
		//List(I)  - add, delete, update
		 // ArrayList(C) - add, delete, update
		 // LinkedList(C) - add, delete, update
		 // Vector(C)  - add, delete, update
		 // Stact(C)  - add, delete, update
		  
		System.out.println();
		//Interface
		  X ref1=new X(); //tight coupling
		//Y x1=new Y();
		  ref1.m1();
		  ref1.m2();
		  ref1.m3();
		  ref1.m4();
		  
		  System.out.println();
		  Intf1 ref2=new X(); //loose coupling
		  ref2.m1();
		  ref2.m2();
		  ref2.m3();
		  
		  System.out.println();
		  Person p1 = new Person();
		  p1.getAddress(); // Person
		  p1.getDob(); // Person
		  p1.getFirstName(); // Person
		  p1.getLastName(); // Person
		  p1.setAddress(null); // Person
		  p1.setDob(null); // Person
		  p1.setFirstName(null); // Person
		  p1.setLastName(null); // Person
		  
		  System.out.println();
		  Student std2 = new Student();
		  std2.getRollNo(); //Student
		  std2.getAddress(); // Person
		  std2.getFirstName(); //Person
		  
		  System.out.println();
		  Person p2 = new Student();
		  p2.getAddress(); // Person
		  p2.getDob(); // Person
		  p2.getFirstName(); // Person
		  p2.getLastName(); // Person
		  p2.setAddress(null); // Person
		  p2.setDob(null); // Person
		  p2.setFirstName(null); // Person
		  p2.setLastName(null);
		  //Student std2 = new Person(); //child cannot hold parent - Invalid
		  
		  System.out.println();
		  System.out.println(Intf1.x);
		  System.out.println(Intf1.y);
		  
		  Intf1.m4();
		  ref2.m5();
	}

}
