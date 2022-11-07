package Day7;

public class Test {
	//static Employee emp1;
	
	public static void main(String[] args) {
		Test t=new Test();
		int x=10;
		Employee emp1=new Employee(1001,"Ram",65000);
		Employee emp2=emp1;
		t.m1(emp1);
		System.out.println("emp1: "+emp1.getEmpName()); //Ram
		t.m2(x);
		System.out.println("x: "+x);//10
	}
	
	 void m1(Employee emp) {
		System.out.println("emp Before Sam: "+emp.getEmpName()); //Ram
		emp=new Employee(1002,"Sam",54000);
		System.out.println("emp After Sam: "+emp.getEmpName()); //Sam
	}
	 
	 void m2(int i) {
		 System.out.println("Before i=100: "+i);//10
		 i=100;
		 System.out.println("After i=100: "+i);//100
	 }

}
