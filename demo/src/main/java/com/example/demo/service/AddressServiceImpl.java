package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Address;
import com.example.demo.repository.IAddressRepository;

public class AddressServiceImpl implements IAddressService {

	@Autowired
	IAddressRepository addrRepo;
	
	
	@Override
	public Address addAddress(Address addr) {
		Address adr1=addrRepo.save(addr);
		return adr1;
	}

	@Override
	public Address deleteAddressById(int addrId) {
		return null;
	}

	@Override
	public Address getAddressById(int addrId) {
		return null;
	}

	@Override
	public List<Address> getAllAddress() {
		return null;
	}

}
