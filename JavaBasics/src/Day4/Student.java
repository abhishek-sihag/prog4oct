package Day4;

import java.time.LocalDate;

public class Student extends Person {
	
	// Field
	private long rollNo;
	
	// Constructors
	public Student() {}
	
	public Student(long rollNo) {
		super();
		this.rollNo = rollNo;
	}
		
	public Student(long rollNo, String firstName, String lastName, LocalDate dob) {
		super(firstName, lastName, dob);
		this.rollNo=rollNo;
	}
	
	// getters & setters
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	

}