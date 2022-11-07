package com.jpa.demo.dao;

import java.util.List;
//logic related to database should be here in dao
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public Employee addEmployee(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
	
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return emp;
	
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// Get emp by id
		Employee emp= em.find(Employee.class, empId);
		
		// remove employee
		em.remove(emp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Employee emp= em.find(Employee.class, empId); //empId is primary key here
		
		em.close();
		emf.close();
		
		return emp;
		
	}

	@Override
	public List<Employee> getEmployeeByName(String empName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
				
		// Get emp by name
		//Employee emp= em.find(Employee.class, empName);
		Query q = em.createQuery("select e from Employee e where e.empName=:name"); // JPQL Query
		q.setParameter("name", empName);
		
		List<Employee> empList = q.getResultList();
		
		em.close();
		emf.close();
	
		return empList;

	}

	@Override
	public List<Employee> getAllEmployees() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		Query query = em.createQuery("select e from Employee e"); // JPQL
		List<Employee> empList= query.getResultList();
		
		em.close();
		emf.close();
		
		return empList;
	
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		//get emp by id
		Employee dbEmp= em.find(Employee.class, empId);
		
		//update dbEmp details by refering emp obj
		dbEmp.setEmpName(emp.getEmpName());
		dbEmp.setSalary(emp.getSalary());
		
		//merge
		em.getTransaction().begin();
		Employee updatedEmp=em.merge(dbEmp);
		em.getTransaction().commit();
		
		//close
		em.close();
		emf.close();
		
		return dbEmp;
		
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Employee dbEmp= em.find(Employee.class, empId);
		
		
		// Update employee name
		dbEmp.setEmpName(newName);
		
		// update emp in database
		em.getTransaction().begin();
		em.persist(dbEmp);
		em.getTransaction().commit();
		
		//close
		em.close();
		emf.close();
		
		//return updated emp object
		return dbEmp;
		
		
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		
		return null;
	}

	@Override
	public Employee updateEmployeeDepartment(int empId, int deptId) {
		
		return null;
	}
	
	public Employee updateEmployeeSkills(int empId, List<Skill> skills) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		// Get emp by id
		Employee dbEmp = em.find(Employee.class, empId);

		// update emp skills
		dbEmp.getSkill().addAll(skills);
//		for (Skill skill : skills) {
//			dbEmp.getSkill().add(skill);
//		}
		// merge
		em.getTransaction().begin();
		em.merge(dbEmp);
		em.getTransaction().commit();
		System.out.println("DAO: "+ dbEmp);
		
		// close
		em.close();
		emf.close();
		return dbEmp;
	}

}