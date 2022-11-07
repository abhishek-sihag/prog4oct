package Day4;

public interface Intf1 {
	
	//fields
	int x=100; // public, static, final
	public static final int y=200;
	
	void m1(); // public, abstract
	void m2();
	void m3();
	
	// 1.8v - static and default methods allowed to create
	// static method
	static void m4() {
		System.out.println("Intf1 - m4() static method");
	}
	
	//default method
	default void m5() {
		System.out.println("Intf1 - m5() default method");
	}

}
