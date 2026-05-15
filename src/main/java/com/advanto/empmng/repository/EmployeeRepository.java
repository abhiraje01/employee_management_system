package com.advanto.empmng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advanto.empmng.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
