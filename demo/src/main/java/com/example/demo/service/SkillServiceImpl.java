package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Skill;
import com.example.demo.exceptions.SkillNotFoundException;
import com.example.demo.repository.ISkillRepository;


@Service
public class SkillServiceImpl implements ISkillService {
	
	@Autowired
	ISkillRepository skillRepo;
	

	@Override
	public Skill addSkill(Skill skill) {
		//add skills to db by calling skillRepository save method
		Skill newSkill=skillRepo.save(skill);
		return newSkill;
	}

	@Override
	public Skill getSkillById(int skillId) throws SkillNotFoundException {
		Optional<Skill> opt=skillRepo.findById(skillId);
		if(opt.isPresent()) {
			Skill skill=opt.get();
			return skill;
		}else {
			throw new SkillNotFoundException("Skill not found with given id: "+skillId);
		}
	}

	@Override
	public List<Skill> getAllSkills() {
		return null;
	}

	@Override
	public void removeSkill(int skillId) {

	}

	@Override
	public List<Skill> getSkillsByEmpId(int empId) {
		return skillRepo.getSkillsByEmpId(empId);
	}

}
