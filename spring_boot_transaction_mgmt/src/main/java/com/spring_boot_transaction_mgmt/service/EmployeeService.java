package com.spring_boot_transaction_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_transaction_mgmt.entities.Address;
import com.spring_boot_transaction_mgmt.entities.Employee;
import com.spring_boot_transaction_mgmt.repository.AddressRepo;
import com.spring_boot_transaction_mgmt.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private EmployeeRepo employeeRepo;
	
	private AddressService addressService;
	
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo,AddressService addressService) {
		this.employeeRepo = employeeRepo;
		this.addressService = addressService;
	}
	
	@Transactional
	public boolean saveEmployee(Employee employee) {
		Employee e1 = employeeRepo.save(employee);
		
		Address a1 = new Address();
		a1.setEmployee(e1);
		a1.setAddress("Jabalpur");
		
		addressService.saveAddress(a1);
		
		return true;
		
		
	}
	

}
