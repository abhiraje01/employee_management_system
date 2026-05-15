package com.advanto.empmng.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanto.empmng.entity.Employee;
import com.advanto.empmng.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeservice.saveEmployee(employee);
		
	}
	
	@GetMapping
	public Page<Employee> getAllEmployee(){
		return employeeservice.getAllEmployees(0,1,"id");
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable long id) {
		return employeeservice.getEmployeeById(id);
		
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable long id,@RequestBody Employee employee) {
		return employeeservice.updateEmployee(id, employee);
	
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable long id) {
		employeeservice.deleteEmployee(id);
		
		return "Employee deleted";
		
	}

}
