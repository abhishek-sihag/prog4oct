package com.example.demo.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//controller is going to contact service
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpInputDto;
import com.example.demo.dto.EmpOutputDto;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;



@RestController  //request handler //convenience annotation that is itself annotated with @Controller and @ResponseBody
public class EmployeeController {
	
	@Autowired  //automatic dependency injection
	IEmployeeService empServ;
	
	//Add employee  //@Valid to validate
	@PostMapping("/employee/add")
	ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee emp) { //addEmployee method from EmployeeServiceImpl
		System.out.println(emp);
		Employee newEmp=empServ.addEmployee(emp);
		System.out.println(newEmp);
		ResponseEntity<Employee> response= new ResponseEntity<> (newEmp, HttpStatus.CREATED);
		return response;
	};
	
	@PostMapping("/employee/add/dto")
	ResponseEntity<EmpOutputDto> addEmployee(@Valid @RequestBody EmpInputDto emp) { //addEmployee method from EmployeeServiceImpl
		System.out.println(emp);
		EmpOutputDto newEmp=empServ.addEmployee(emp);
		System.out.println(newEmp);
		ResponseEntity<EmpOutputDto> response= new ResponseEntity<> (newEmp, HttpStatus.CREATED);
		return response;
	};
	
	@GetMapping("/employee/get/{empId}")
	ResponseEntity<Employee> getEmployeeById(@PathVariable int empId){
		Employee emp=empServ.getEmployeeById(empId);
		return new ResponseEntity<> (emp, HttpStatus.OK); //200 OK
	};
	
	@DeleteMapping("/employee/delete/{empId}")
	ResponseEntity<Employee> deleteEmployeeById(@PathVariable int empId) {
		Employee emp=empServ.deleteEmployeeById(empId);
		return new ResponseEntity<> (emp, HttpStatus.OK); //200 Ok
	};
	
//	@GetMapping("/employee/findByName/{name}")
//	ResponseEntity<Employee> getEmployeeByName(@PathVariable("empName") String name){
//		List<Employee> empList=empServ.getEmployeeByName(name);
//		return new ResponseEntity<>(empList, HttpStatus.OK);
//	}; //error remember!
	@GetMapping("/employee/findByName/{empName}")
    ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("empName") String name) {
    	List<Employee> empList =empServ.getEmployeeByName(name);
    	return new ResponseEntity<>(empList, HttpStatus.OK);
    };
	
	@GetMapping("/employee/findAll")
	ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> empList=empServ.getAllEmployees();
		return new ResponseEntity<>(empList, HttpStatus.OK);
	};
	
	@PutMapping("/employee/update/{empId}")
	ResponseEntity<Employee> updateEmployee(@PathVariable int empId, @RequestBody Employee emp) {
		Employee updatedEmp=empServ.updateEmployee(empId, emp);
		
		return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
	};
	
	@PatchMapping("/employee/update/name/{name}/empId/{id}")
	ResponseEntity<Employee> updateEmployeeName(@PathVariable("id") int empId, @PathVariable("name") String newName) {
		Employee updatedEmpName=empServ.updateEmployeeName(empId, newName);
		return new ResponseEntity<>(updatedEmpName, HttpStatus.OK);
	};
	
	@PostMapping("/employee/{empId}/add/addrList")
	ResponseEntity<Employee> addEmpAddr(@PathVariable int empId, @RequestBody List<Address> addrList) {
		Employee updatedAddress=empServ.addEmpAddr(empId, addrList);
		return new ResponseEntity<>(updatedAddress, HttpStatus.OK);
	};
	
	@PostMapping("/employee/{empId}/add/address")
    Employee addEmpAddr(@PathVariable int empId, @RequestBody Address addr) {
    	return null;
    };
	
	@PostMapping("/employee/{empId}/address/{addrId}")
	ResponseEntity<Employee> addEmpAddr(@PathVariable int empId, @PathVariable int addrId) {
		Employee updatedAddress = empServ.addEmpAddr(empId, addrId);
		return new ResponseEntity<>(updatedAddress, HttpStatus.OK);
	};
	
//	Employee updateEmployeeSalary(int empId, double newSalary);
//	Employee updateEmployeeDepartment(int empId, int deptId);
	
	//Sorting
	//get all
	@GetMapping("/employee/sort/{sortBy}")
	ResponseEntity<List<Employee>> getAllEmployeesInSortingOrder(@PathVariable("sortBy") String sortBy) {
		List<Employee> empList  = empServ.getAllEmployeesInSortingOrder(sortBy);
		return new ResponseEntity<>(empList, HttpStatus.OK);
	};
	
	//Pagination
	@GetMapping("/employee/pagination/{offset}/{pageSize}")
	ResponseEntity<Page<Employee>> getAllEmployeesWithPagination(@PathVariable("offset") int offset, @PathVariable("pageSize") int pageSize) {
		Page<Employee> employee  = empServ.getAllEmployeesWithPagination(offset, pageSize);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	};
	
	//pagination and sorting
	@GetMapping("/employee/pagination/{offset}/{pageSize}/{field}")
	ResponseEntity<Page<Employee>> getAllEmployeesWithPaginationAndSorting(@PathVariable("offset") int offset, @PathVariable("pageSize") int pageSize, @PathVariable("") String field) {
		Page<Employee> employee  = empServ.getAllEmployeesWithPaginationAndSorting(offset, pageSize, field);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	};
	
}
