package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	//no need to write here because SimpleJpaRepository provide basics here
	//JpaRepository<Employee, Integer> -- responsible for basic crud operations
	//if JpaRepository doesn't provide any method you have to write your own
	
	
	List<Employee> findByEmpName(String name);
	List<Employee> findBySalary(double salary);
	
	List<Employee> findBySalaryLessThan(double salary); //from Query creation from docs.spring.io
	List<Employee> findBySalaryGreaterThan(double salary);
}