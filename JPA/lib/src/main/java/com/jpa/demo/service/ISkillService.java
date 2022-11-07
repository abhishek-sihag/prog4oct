package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.entity.Skill;

public interface ISkillService {
	Skill addSkill(Skill skill);
	Skill getSkillById(int skillId);
	List<Skill> getAllSkills();
	void removeSkill(int skillId);

}
