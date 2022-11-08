package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmpInputDto;
import com.example.demo.dto.EmpOutputDto;
import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Login;
import com.example.demo.exceptions.EmployeeNotFoundException;
import com.example.demo.repository.IAddressRepository;
import com.example.demo.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository empRepo; //no need to use "new" keyword
	IAddressRepository addrRepo;
	
	
	@Override
	public Employee addEmployee(Employee emp) {
		//Add employee to database
		Employee newEmp=empRepo.save(emp);
		//return newly added employee object
		return newEmp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		Optional<Employee> opt=empRepo.findById(empId);
		Employee emp=null; //local variable has to initialize
		if(opt.isPresent()) {
			//read employee object from Optional
			emp= opt.get();
			empRepo.deleteById(empId);
		}
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Optional<Employee> opt=empRepo.findById(empId);
		Employee emp=null; //local variable has to initialize
		if(opt.isPresent()) {
			//read employee object from Optional
			emp= opt.get();
		}else {
			throw new EmployeeNotFoundException("Employee not found for given id: "+empId);
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		return empRepo.findByEmpName(name);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList= empRepo.findAll();
		
		return empList;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		Optional<Employee> opt=empRepo.findById(empId);
		if(opt.isPresent()) {
			//read employee object from Optional
			return empRepo.save(emp);  //this save is going to update the details
		}else {
			throw new EmployeeNotFoundException("Employee not found for given id: "+empId);
		}
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		Optional<Employee> opt=empRepo.findById(empId);
		Employee updatedEmp=null;
		if(opt.isPresent()) {
			//get emp from optional container
			Employee emp= opt.get();
			//update employee
			emp.setEmpName(newName);
			updatedEmp= empRepo.save(emp); //this save is going to update the details
		}else {
			throw new EmployeeNotFoundException("Employee not found for given id: "+empId);
		}
		return updatedEmp;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		return null;
	}

	@Override
	public Employee updateEmployeeDepartment(int empId, int deptId) {
		return null;
	}

	@Override
	public EmpOutputDto addEmployee(EmpInputDto empDto) {
		System.out.println("===================");
		System.out.println("Before conversion: ");
		System.out.println(empDto);
		System.out.println("===================");
		
		//convert DTO to Employee
		//create employee object
		Employee emp= new Employee();
		emp.setEmpName(empDto.getEmpName());
		//create login object
		Login login= new Login();
		login.setEmail(empDto.getEmail());
		login.setPassword(empDto.getPassword());
		login.setRole(empDto.getRole());
		emp.setLogin(login);
		System.out.println("===================");
		System.out.println("After conversion: ");
		System.out.println(emp);
		System.out.println("===================");
		
		Employee newEmp=empRepo.save(emp);
		System.out.println("================");
		System.out.println("Before Conversion");
		System.out.println(newEmp);
		System.out.println("================");
		
		//convert Employee to DTO
		EmpOutputDto empOutputDto=new EmpOutputDto();
		empOutputDto.setEmpId(newEmp.getEmpId());
		empOutputDto.setEmpName(newEmp.getEmpName());
		empOutputDto.setEmail(newEmp.getLogin().getEmail());
		empOutputDto.setRole(newEmp.getLogin().getRole());
		
		System.out.println("===================");
		System.out.println("After conversion: ");
		System.out.println(empOutputDto);
		System.out.println("===================");
		
		return null;
	}

	//add list of addresses to the existing employee
	@Override
	public Employee addEmpAddr(int empId, List<Address> addrList) {
		//findById - find emp based on Id
		//if emp present - add list of address to the existing addr list
		//call save() method to update addr details in db
		//return map
		Optional<Employee> opt=empRepo.findById(empId);
		Employee updatedEmp=null;
		if(opt.isPresent()) {
			updatedEmp=opt.get();
			//updatedEmp.setAddress(addrList);
		    List<Address> addrList1=updatedEmp.getAddress();
		    addrList1.addAll(addrList);
		    updatedEmp= empRepo.save(updatedEmp);
			
		}
		return updatedEmp;
	}
	
	//map existing emp with existing addr
	@Override
	public Employee addEmpAddr(int empId, int addrId) {
		//findById - find emp based on Id
		//if emp/address present - add list of address to the existing addr list
		//call save() method to update addr details in db
		//return map
		Optional<Employee> opt=empRepo.findById(empId);
		Optional<Address> opt1=addrRepo.findById(empId);
		Employee emp=null;
		Address addr=null;
		if(opt.isPresent() || opt1.isPresent()) {
			emp=opt.get();
			addr=opt1.get();
			emp.getAddress().add(addr);
			empRepo.save(emp);
		}
		return emp;
	}

	@Override
	public Employee addEmpAddr(int empId, Address addr) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesInSortingOrder(String sortBy) {
		//sort in asc order
		//List<Employee> employees=empRepo.findAll(Sort.by(Direction.ASC, sortBy));
		
		List<Employee> employeeList=empRepo.findAll(Sort.by(Direction.DESC, sortBy));
		return employeeList;
	}

	@Override
	public Page<Employee> getAllEmployeesWithPagination(int offset, int pageSize) {
		Page<Employee> employees= empRepo.findAll(PageRequest.of(offset, pageSize));
		
		return employees;
	}

	@Override
	public Page<Employee> getAllEmployeesWithPaginationAndSorting(int offset, int pageSize, String field) {
        Page<Employee> employees= empRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.Direction.ASC, field));
		
		return employees;
	}
	
	
	
}
