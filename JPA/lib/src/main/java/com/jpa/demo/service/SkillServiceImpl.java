package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.dao.ISkillDao;
import com.jpa.demo.dao.SkillDaoImpl;
import com.jpa.demo.entity.Skill;

public class SkillServiceImpl implements ISkillService {

	ISkillDao skillDao= new SkillDaoImpl();
	@Override
	public Skill addSkill(Skill skill) {
		return skillDao.addSkill(skill);
	}

	@Override
	public Skill getSkillById(int skillId) {
		return skillDao.getSkillById(skillId);
	}

	@Override
	public List<Skill> getAllSkills() {
		return null;
	}

	@Override
	public void removeSkill(int skillId) {

	}

}
