package com.jpa.demo.service;

import java.util.List;
//business logic in service
import com.jpa.demo.dao.EmployeeDaoImpl;
import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public class EmployeeServiceImpl implements IEmployeeService{
	
	//creating object for Dao
	EmployeeDaoImpl empDao=new EmployeeDaoImpl();

	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("Service: "+emp);
		//if you want to write any logic before adding employee, write here only
		return empDao.addEmployee(emp);
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		return empDao.deleteEmployeeById(empId);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return empDao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return empDao.getEmployeeByName(name);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return empDao.updateEmployee(empId, emp);
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		return empDao.updateEmployeeName(empId, newName);
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		//can write like this also
		Employee emp= empDao.updateEmployeeSalary(empId, newSalary);
		return emp;
	}

	@Override
	public Employee updateEmployeeDepartment(int empId, int deptId) {
		//can write like this also
		Employee emp= empDao.updateEmployeeDepartment(empId, deptId);
		return emp;
	}

	@Override
	public Employee updateEmployeeSkills(int empId, List<Skill> skills) {
		
		return empDao.updateEmployeeSkills(empId, skills);
	}
	

}
