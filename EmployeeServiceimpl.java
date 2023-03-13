package com.employee.details.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.details.DTO.EmployeeDTO;
import com.employee.details.Exception.EmployeeException;
import com.employee.details.entity.Employee;
import com.employee.details.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public EmployeeDTO getEmployee(Integer Id) throws EmployeeException {
		Optional<Employee> optional = employeeRepository.findById(Id);
		Employee employee = optional.orElseThrow(() -> new EmployeeException("Service.Employee_NOT_FOUND"));
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmailid(employee.getEmailid());
		employeeDTO.setId(employee.getId());
		employeeDTO.setName(employee.getName());
		employeeDTO.setAge(employee.getAge());
		return employeeDTO;
	}
	


}
