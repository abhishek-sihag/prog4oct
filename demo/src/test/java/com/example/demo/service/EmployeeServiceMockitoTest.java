package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.entity.Employee;
import com.example.demo.repository.IEmployeeRepository;

@ExtendWith(SpringExtension.class)
class EmployeeServiceMockitoTest {
	
	@InjectMocks //creates instance of a class and injects mocks with @Mock
	EmployeeServiceImpl empServ;
	
	@MockBean //create mock of a class or interface
	IEmployeeRepository empRepo;
	
	//initialization of mock objects
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Disabled
	@Test  
	void getEmployeeByIdTest() { //add 'Test' before or after 
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Sam");
		emp.setSalary("10000");
		
		Mockito.when(empRepo.findById(41)).thenReturn(Optional.of(emp));
		Employee response= empServ.getEmployeeById(41);
		
		assertEquals(100, response.getEmpId());
		assertEquals("Sam", response.getEmpName());
		assertEquals(10000, response.getSalary());
	}
	
	@Disabled
	@Test
	void getAllEmployeesTest() {
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Ram");
		emp1.setSalary("10000");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("Sam");
		emp2.setSalary("20000");
		
		List<Employee> empList =new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		Mockito.when(empRepo.findAll()).thenReturn(empList);
		
		List<Employee> empList2=empServ.getAllEmployees();
		assertEquals(2, empList2.size());
		assertEquals("Ram", empList2.get(0).getEmpName());
	}
	@Disabled
	@Test
		void addEmployeeTest() {
			Employee emp = new Employee();
			emp.setEmpId(100);
			emp.setEmpName("Sam");
			emp.setSalary("10000");
			
			Mockito.when(empRepo.save(emp)).thenReturn(emp);
			
			Employee newEmp=empServ.addEmployee(emp);
			assertEquals(100, newEmp.getEmpId());
			assertEquals("Sam", newEmp.getEmpName());
			assertEquals(10000, newEmp.getSalary());
			
			
		}
	@Disabled
	@Test
		void updateEmployeeNameTest() {
			//old employee object
			Employee oldEmp = new Employee();
			oldEmp.setEmpId(101);
			oldEmp.setEmpName("Krish");
			oldEmp.setSalary("40000");
			
			//updated employee object
			Employee updatedEmp = new Employee();
			updatedEmp.setEmpId(101);
			updatedEmp.setEmpName("Krishna");
			updatedEmp.setSalary("40000");
			
			Mockito.when(empRepo.findById(101)).thenReturn(Optional.of(oldEmp));
			Mockito.when(empRepo.save(oldEmp)).thenReturn(updatedEmp); //save oldEmp to call all the not updated details because here only empName detail is update here
			
			Employee response= empServ.updateEmployeeName(101, "Krishna");
			assertEquals(101, response.getEmpId());
			assertEquals("Krishna", response.getEmpName());
		}
	

}
