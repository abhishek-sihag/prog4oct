package com.jpa.demo.entity;

//for every entity you have to create one interface class also
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	//fields
	@Id
	@GeneratedValue
	private int addrId;
	private String city;
	private String state;
	
	//constructors
	public Address() {}
	

	public Address(int addrId, String city, String state) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.state = state;
	}
	


	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	//getters setters


	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	//without override method you'll get hashcode
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + "]";
	}


	
}
