package com.spring_boot_transaction_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_transaction_mgmt.entities.Employee;

@RestController
public class MainController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
		boolean result = employeeService.saveEmployee(employee);
		if(result) {
			return ResponseEntity.ok("Saved");
		}
		else {
			return ResponseEntity.ok("Error");
		}
		
	}
}
