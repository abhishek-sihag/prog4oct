package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

//test case method in src/test/java
//for pagination and sorting methods defined in controller and service

@Entity
@Data   //instead this you can use below methods 
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter //you can also add this method at field level
//@Setter //you can also add this method at field level
//@ToString
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
//	@Getter
//	@Setter
	//private String firstName;
//	@Getter
//	@Setter
	//private String lastName;
	@NotNull(message="employee name must not null.")
	@NotEmpty(message="employee name must not empty.")
	@NotBlank(message="employee name must not blank.")
	private String empName;
	private String salary;
	
	//OneToOne Relationship - Has A relationship
	@OneToOne(cascade=CascadeType.ALL) //while performing actions on employee table similarly by same you can perform actions on login & no need to make separate requests
	@JoinColumn(name="emp_login_fk") //can give any name, it is for understanding that it is foreign key for employee
	private Login login; //to establish rln with login
	
	// OneToMany
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_addr_fk")
	private List<Address> address;
	
	
	//ManyToMany
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.REFRESH, CascadeType.MERGE})
	@JoinTable(
				name= "employee_skills",
				joinColumns= {@JoinColumn(name="emp_id")},
				inverseJoinColumns= {@JoinColumn(name="emp_skill")}
				)
	private List<Skill> skill;
	
	
	//Constructors
	//Getters Setters
	//toString

}
