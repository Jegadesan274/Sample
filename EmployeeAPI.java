package com.employee.details.API;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.details.DTO.EmployeeDTO;
import com.employee.details.Service.EmployeeService;
import com.employee.details.Service.EmployeeServiceimpl;


@RestController
@RequestMapping(value="/employee")
public class EmployeeAPI {

	@Autowired
	private EmployeeServiceimpl employeeServiceimpl;

	@GetMapping(value="/Id")
	public ResponseEntity<EmployeeDTO> getEmployeeDetails( @PathVariable Integer Id) throws Exception {
		EmployeeDTO  Employee = employeeServiceimpl.getEmployee(Id);
		return new ResponseEntity<>(Employee, HttpStatus.OK);
	}
	
	

}
