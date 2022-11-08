package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Skill;
import com.example.demo.exceptions.SkillNotFoundException;

public interface ISkillService {
	
	
	Skill addSkill(Skill skill);
	Skill getSkillById(int skillId) throws SkillNotFoundException;
	List<Skill> getAllSkills();
	void removeSkill(int skillId);
	List<Skill> getSkillsByEmpId(int empId);

}
