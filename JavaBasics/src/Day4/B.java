package Day4;

public abstract class B extends A{

	int z = 100;
	
	void m4() {
		System.out.println("Class B - m4() method");
	}
	
	@Override
	void m2() {
		System.out.println("Class B - m4() method");
		
	}

	abstract void m5();
	

}
