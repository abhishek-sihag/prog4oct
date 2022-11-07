package com.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.demo.entity.Skill;

public class SkillDaoImpl implements ISkillDao {

	@Override
	public Skill addSkill(Skill skill) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
	
		em.getTransaction().begin();
		em.persist(skill);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return skill;
	
	}

	@Override
	public Skill getSkillById(int skillId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Skill skill= em.find(Skill.class, skillId);
		
		em.close();
		emf.close();
		
		return skill;
	}

	@Override
	public List<Skill> getAllSkills() {
		
		return null;
	}

	@Override
	public void removeSkill(int skillId) {
		

	}
}
