package com.employee.details.Service;

import java.util.List;

import com.employee.details.DTO.EmployeeDTO;
import com.employee.details.Exception.EmployeeException;

public interface EmployeeService {

	//public EmployeeDTO getEmployee(Integer Id) throws EmployeeException;
	public EmployeeDTO getEmployee(Integer Id) throws EmployeeException;

}
