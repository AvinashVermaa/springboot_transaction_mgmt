package com.spring_boot_transaction_mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_boot_transaction_mgmt.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long>{

	
}
