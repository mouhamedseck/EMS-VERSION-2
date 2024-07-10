package com.seck.service;

import java.util.List;

import dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto creatEmployee(EmployeeDto employeeDto);
	EmployeeDto getEmployeeById(Long employeeId);
	List<EmployeeDto> getAllEmployees();
	EmployeeDto updatEmployee(Long employeeId, EmployeeDto updatedEmployee);
	void deleteEmployee(Long employeeId);
}
