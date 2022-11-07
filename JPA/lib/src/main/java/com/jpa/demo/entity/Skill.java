package com.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Skill {
	
	//fields
	@Id
	@GeneratedValue
	int skillId;
	String skillName;
	
	//constructor
	public Skill() {    //default constructor
		super();
	}
	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}
	
	//getters & setters
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	//toString
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	}
	
	

} //class skill
