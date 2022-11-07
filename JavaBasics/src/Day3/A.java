package Day3;

//multilevel

public class A {
	int x=10;
	int y=100;
	
	void m1() {
		System.out.println("Class A - m1() method");
	}
	
	Person m3() {
		return new Person();
	}

}
