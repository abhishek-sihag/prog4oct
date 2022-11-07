package Lab5;


public class Ex2 {
	
	public static void main(String[] args) {
		
		Ex2 han=new Ex2();
		
		try {
			han.m2();
		} catch (InvalidFullNameException e) {
			e.printStackTrace();
		} 

	}
	
	void m2() throws InvalidFullNameException {
		String firstName="Ravi";
		String lastName="";
		
		if(firstName.isBlank() || lastName.isBlank()) {
			throw new InvalidFullNameException("Input a valid full name");
		}else {
			System.out.println(firstName+" "+lastName);
		}
		
		
	}

}
