package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login, String> {
	
	//JPQL
//	@Query("select l.email, l.password, l.role from Login l join Employee e on e.login=l.email where e.empId=25")
//	Login getLoginByEmpId(@Param("empId") int empId);
	
	//Native Query
	@Query(value="select * from login join employee on employee.emp_login_fk=login.email where employee.emp_id=:empId", nativeQuery = true)
	Login getLoginByEmpId(@Param("empId") int empId);
	
	
}
