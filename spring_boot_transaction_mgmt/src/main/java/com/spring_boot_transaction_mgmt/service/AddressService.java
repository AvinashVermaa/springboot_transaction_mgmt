package com.spring_boot_transaction_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_transaction_mgmt.entities.Address;
import com.spring_boot_transaction_mgmt.repository.AddressRepo;

@Service
public class AddressService {

	private AddressRepo addressRepo;
	
	@Autowired
	public AddressService(AddressRepo addressRepo) {
		this.addressRepo = addressRepo;
	}
	
	public Address saveAddress(Address address) {
		 return addressRepo.save(address);
	}
}
