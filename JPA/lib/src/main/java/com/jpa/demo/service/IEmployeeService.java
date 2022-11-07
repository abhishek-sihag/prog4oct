package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public interface IEmployeeService { //start with upper camel case
	
	//abstract methods (without any body)
	Employee addEmployee(Employee emp);  //start with lower camel case
	Employee deleteEmployeeById(int empId);
	Employee getEmployeeById(int empId);
	List<Employee> getEmployeeByName(String name);
	List<Employee> getAllEmployees();
	Employee updateEmployee(int empId, Employee emp);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmployeeSalary(int empId, double newSalary);
	Employee updateEmployeeDepartment(int empId, int deptId);
	
	Employee updateEmployeeSkills(int empId, List<Skill> skills);

}
