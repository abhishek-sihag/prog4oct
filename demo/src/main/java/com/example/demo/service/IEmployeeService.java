package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.dto.EmpInputDto;
import com.example.demo.dto.EmpOutputDto;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;

public interface IEmployeeService {
	
	Employee addEmployee(Employee emp);  //start with lower camel case
	Employee deleteEmployeeById(int empId);
	Employee getEmployeeById(int empId);
	List<Employee> getEmployeeByName(String name);
	List<Employee> getAllEmployees();
	Employee updateEmployee(int empId, Employee emp);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmployeeSalary(int empId, double newSalary);
	Employee updateEmployeeDepartment(int empId, int deptId);
	EmpOutputDto addEmployee(EmpInputDto empDto); //dto service
	Employee addEmpAddr(int empId, List<Address> addrList); //to address mapping, add more address to one employee
	Employee addEmpAddr(int empId, Address addr);
	Employee addEmpAddr(int empId, int addrId);
	List<Employee> getAllEmployeesInSortingOrder(String sortBy);
	Page<Employee> getAllEmployeesWithPagination(int offset, int pageSize);
	Page<Employee> getAllEmployeesWithPaginationAndSorting(int offset, int pageSize, String field);
}
