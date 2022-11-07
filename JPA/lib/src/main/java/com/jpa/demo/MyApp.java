package com.jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpa.demo.entity.Address;
//presentation method
//like entity & service, one method called utility for common methods which use in every code
//before applying new method drop table it'll be safe
import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Login;
import com.jpa.demo.entity.Skill;
import com.jpa.demo.service.EmployeeServiceImpl;
import com.jpa.demo.service.IEmployeeService;
import com.jpa.demo.service.ISkillService;
import com.jpa.demo.service.SkillServiceImpl;

/*
 * My Application depends on Service & Service depends on DAO
 * 
 * JPA - Java Persistence API - Specification
 * ORM Tools - Object Relational Mapping
 * Hibernate
 * MyBatis
 * EclipseLink
 * TopLink
 * 
 * Relationships:
 *  OneToOne
 *   User & Login
 *   User & Profile
 *  OneToMany
 *   User & Address
 *   Employee & Department
 *  ManyToOne
 *  ManyToMany
 *   Book & Author
 *   
 *  Unidirectional
 *  Bidirectional
 */

public class MyApp {
	
 	  public static void main(String[] args) {
		IEmployeeService empService=new EmployeeServiceImpl();
		ISkillService skillService= new SkillServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select any one of the below option:: ");
		System.out.println("1: Add Employee");
		System.out.println("2: Delete Employee");
		System.out.println("3: Get Employee by Id");
		System.out.println("4: Get All Employees");
		System.out.println("5: Update Employee");
		System.out.println("6: Update Employee name");
		System.out.println("7: Get Employee by name");
		System.out.println("8: Add Employee address");
		System.out.println("9: Add new skill");
		System.out.println("10: Add Employee skills");
		
		int optionSelected =sc.nextInt();
		
		switch(optionSelected) {
		case 1:
//			System.out.println("Enter employee id");
//			int empId = sc.nextInt();
			System.out.println("Enter employee name");
			String name = sc.next();
			System.out.println("Enter employee salary");
			double salary = sc.nextDouble();
			
			//get login details
			System.out.println("Enter employee email addr");
			String email = sc.next();
			System.out.println("Enter employee password");
			String password = sc.next();
			
			//get Address details
			System.out.println("Enter number of address to be added");
			int numAddr =sc.nextInt();
			List<Address> addrList= new ArrayList<>();
			for(int i=0;i<numAddr;i++) {
				System.out.println("Enter city name: ");
				String city= sc.next();
				
				System.out.println("Enter state name: ");
				String state= sc.next();
				//create address object
				Address addr= new Address(city, state);
				//add addr object to addrList
				addrList.add(addr);
			}
			//create login object using email & password
			Login login=new Login(email, password);
			
			//create emp object
			Employee emp = new Employee(name, salary, login, addrList);
			//Employee emp = new Employee(empId, name, salary);
			
			//call service addEmployee() method to add emp to db
			Employee newEmp = empService.addEmployee(emp);
			System.out.println("New Employee: "+newEmp);
			
			//in SQL use:  SELECT * FROM employee JOIN login ON employee.emp_login_fk=login.email;
			
			break;
		case 2:
			//get emp id
			System.out.println("Enter employee id to remove: ");
			int eID=sc.nextInt();
			//call service method to delete employee
			Employee deletedEmp=empService.deleteEmployeeById(eID);
			//print success message
			System.out.println(deletedEmp.getEmpName()+" is deleted employee");
			break;
		case 3:
			System.out.println("Enter employee id: ");
			int empId1 = sc.nextInt();
			Employee emp1 = empService.getEmployeeById(empId1);
			System.out.println(emp1);
			break;
		case 4:
			List<Employee> employees=empService.getAllEmployees();
			for(Employee employee: employees) {
				System.out.println(employee);
			}
			break;
		case 5:
			System.out.println("Enter employee id: ");
			int id=sc.nextInt();
			System.out.println("Enter employee name: ");
			String eName=sc.next();
			System.out.println("Enter latest Employee salary: ");
			double slry = sc.nextDouble();
			//creating emp2 obj
			Employee emp2= new Employee(id, eName, slry);
			//call service method to update database
			Employee updatedEmployee=empService.updateEmployee(id, emp2);
			System.out.println(updatedEmployee);
			break;
		case 6:
			//get id
			System.out.println("Enter employee id: ");
			int id1=sc.nextInt();
			//get name
			System.out.println("Enter employee name: ");
			String eName1=sc.next();
			
			//call service method to update name
			Employee emp3=empService.updateEmployeeName(id1, eName1);
			System.out.println(emp3.getEmpName()+" updated name successfully!");
			break;
		case 7:
			System.out.println("Enter employee name: ");
			String empName=sc.next();
			List<Employee> emps= empService.getEmployeeByName(empName);
			for(Employee e:emps) {
				System.out.println(e);
			}
			break;
		case 8:
			break;
		case 9:
			System.out.println("Enter skill name:");
			String skillName=sc.next();
			Skill skill=new Skill(skillName);
			Skill newSkill=skillService.addSkill(skill);
			System.out.println(newSkill.getSkillName()+" Added successfully!");
			break;
		case 10:
			System.out.println("Enter employee id: ");
			int eId= sc.nextInt();
			System.out.println("Enter number of skills to be added");
			int numSkills=sc.nextInt();
			
			List<Skill> skillList=new ArrayList<>();
			for(int i=0;i<numSkills;i++) {
				System.out.println("Enter skill id to be added");
				System.out.println("11: Java");
				System.out.println("12: Python");
				System.out.println("13: Postgresql");
				int selectedOpt = sc.nextInt();
				Skill selectedSkill = skillService.getSkillById(selectedOpt);
				skillList.add(selectedSkill);
			}
			Employee empWithSkills =empService.updateEmployeeSkills(eId, skillList);
			System.out.println(empWithSkills);
			break;
		default:
			System.out.println("Enter any value between 1 to 10");
		}
		sc.close();
		
	}

}
