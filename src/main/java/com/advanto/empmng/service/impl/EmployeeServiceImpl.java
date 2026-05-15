package com.advanto.empmng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.advanto.empmng.entity.Employee;
import com.advanto.empmng.repository.EmployeeRepository;
import com.advanto.empmng.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	@Override
	public Page<Employee> getAllEmployees(int page, int size, String sortBy) {

		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

		return employeerepository.findAll(pageable);
	}
	
	
	@Override
	public Employee getEmployeeById(long id) {
	
		return employeerepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(long id, Employee employee) {	
		Employee emp = employeerepository.findById(id).get();
		
		emp.setName(employee.getName());
		emp.setEmail(employee.getEmail());
		emp.setDept(employee.getDept());
		emp.setPosition(employee.getPosition());
		emp.setSalary(employee.getSalary());
		emp.setDateofjoining(employee.getDateofjoining());
		
		
		
		return employeerepository.save(emp);
	}

	@Override
	public void deleteEmployee(long id) {
		employeerepository.deleteById(id);
		
	}

}
