package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Skill;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer> {
	
	@Query(value="select skill.skill_id, skill.skill_name from skill join employee_skills on skill.skill_id=employee_skills.emp_skill join employee on employee.emp_id=employee_skills.emp_id where employee.emp_id=:empId",nativeQuery=true)
	List<Skill> getSkillsByEmpId(@Param("empId") int empId);
	
	

}
