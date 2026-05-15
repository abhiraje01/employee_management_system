package com.advanto.empmng.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String dept;
	private String position;
	private double salary;
	private LocalDate dateofjoining;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


//	public Employee(long id, String name, String email, String dept, String position, double salary,
//			LocalDate dateofjoining) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.dept = dept;
//		this.position = position;
//		this.salary = salary;
//		this.dateofjoining = dateofjoining;
//	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getDateofjoining() {
		return dateofjoining;
	}


	public void setDateofjoining(LocalDate dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	
	
	
	
}
