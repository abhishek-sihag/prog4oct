package Day3;

public class B extends A {
	int x=20;
	int z=200;
	
	
	void m2() {
		System.out.println("Class B - m2() method");
	}

	void m1() {
		System.out.println("Class B - m1() method impl");
	}
	
	Student m3() {
		return new Student();
	}

}
