package com.jpa.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
//@Table(name="employee") //giving name to table

public class Employee {
	//fields
	@Id
	@GeneratedValue
	private int empId;
	//@Column(name="emp_name")
	private String empName;
	//@Column(name="sal")
	private double salary;
	
	//create reference to implement Has-A relationship
	//OneToOne Unidirectional
	@OneToOne(cascade= CascadeType.ALL)  
	@JoinColumn(name="emp_login_fk")  //fk - foreign key
	private Login login;
	
	// OneToMany
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_addr_fk")
	private List<Address> address;
	
	//ManyToMany
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name= "employee_skills",
			joinColumns= {@JoinColumn(name="emp_id")},
			inverseJoinColumns= {@JoinColumn(name="emp_skill")}
			)
	private List<Skill> skill;
	
	//constructors
	public Employee() {}
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public Employee(String empName, double salary, Login login) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.login = login;
	}
	public Employee(String empName, double salary, Login login, List<Address> address) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.login = login;
		this.address = address;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", login=" + login
				+ ", address=" + address + ", skill=" + skill + "]";
	}
	
	
	
	

}
