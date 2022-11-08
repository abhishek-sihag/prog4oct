package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;

public interface IAddressService {
	Address addAddress(Address addr);
	Address deleteAddressById(int addrId);
	Address getAddressById(int addrId);
	List<Address> getAllAddress();

}
