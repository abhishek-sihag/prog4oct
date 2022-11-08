package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.EmpInputDto;
import com.example.demo.dto.EmpOutputDto;
import com.example.demo.entity.Employee;
//for every service you have to create each test class
import com.example.demo.exceptions.EmployeeNotFoundException;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {

	@Autowired
	IEmployeeService empServ;
	//each test case to test one method
	
	@Test
	//grouping
	@Tag("get")
	@Order(4)
	void getEmployeeByIdTest() {
		Employee emp=empServ.getEmployeeById(41);
		assertEquals("Ram", emp.getEmpName()); //if the output is as this then the test case only pass
		// "Sam" is expected & emp.getEmpName is actual
	};
	
	//@Disabled
	@Test
	//grouping
	//@Tag("get")
	@Order(2)
	void getAllEmployeesTest() {
		List<Employee> empList=empServ.getAllEmployees();
		int totalEmps=empList.size();
		assertEquals(3, totalEmps);
		// 4 is expected & totalEmps is actual
//		Employee emp=empList.get(0);
//		assertEquals("Ram", emp.getEmpName());
//		assertEquals(56000, emp.getSalary());
		
	}
	
	@Disabled  //this is not in use
	@Test
	@Order(5)
	void deleteEmpById() {
		Employee emp=empServ.deleteEmployeeById(44);
		assertEquals("Keerthi", emp.getEmpName());
		assertEquals(44, emp.getEmpId());
		//assertEquals(0, emp.getSalary());
	}
	
	@Disabled
	@Test
	@Order(1)
	void addEmployee() {
		//create emp dto object
		EmpInputDto dto=new EmpInputDto();
		dto.setEmpName("Keertmurty");
		dto.setEmail("keertmurty@example.com");
		dto.setPassword("abcd1234");
		dto.setRole("EmployeeEng");
		
		
		//add emp
		EmpOutputDto outputDto = empServ.addEmployee(dto);
		
		//validate
		assertEquals("Keertmurty", outputDto.getEmpName());
		assertEquals("keertmurty@example.com", outputDto.getEmail());
		assertEquals("EmployeeEng", outputDto.getRole());
	}
	
	//@Disabled
	@Test
	@Order(3)
	void verifyEmployeeNotFoundException() {
		EmployeeNotFoundException ex= assertThrows(EmployeeNotFoundException.class, ()->{
			empServ.getEmployeeById(1000);
			});
		//assertTrue(ex.getMessage().contains("Employee not found with given id: 1000"));
	}
	

}
