package com.advanto.empmng.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.advanto.empmng.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	Page<Employee> getAllEmployees(int page,int size,String sortBy);
	Employee getEmployeeById(long id);
	Employee updateEmployee(long id,Employee employee);
	void deleteEmployee(long id);
}
