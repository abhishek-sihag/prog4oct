package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Skill;
import com.example.demo.exceptions.SkillNotFoundException;
import com.example.demo.service.ISkillService;

@RestController
public class SkillController {
	
	@Autowired
	ISkillService skillServ;
	
	//add new Skill
	@PostMapping("/employee/skill")
	ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
		Skill updatedSkill=skillServ.addSkill(skill);
		return new ResponseEntity<>( updatedSkill, HttpStatus.CREATED);
		
	};
	
	//read skill based on id
	@GetMapping("/skill/get/{skillId}")
	ResponseEntity<Skill> getSkillById(int skillId) throws SkillNotFoundException {
		Skill skill= skillServ.getSkillById(skillId);
		return new ResponseEntity<>(skill, HttpStatus.OK);
	};
	
	
//	List<Skill> getAllSkills();
//	void removeSkill(int skillId);
	
	@GetMapping("/skill/getSkills/byEmpId/{empId}")
	ResponseEntity<List<Skill>> getSkillsByEmpId(@PathVariable("empId") int empId){
		List<Skill> skills=skillServ.getSkillsByEmpId(empId);
		return new ResponseEntity<>(skills, HttpStatus.OK);
	};

}
