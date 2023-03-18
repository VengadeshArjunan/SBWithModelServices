package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	public Employee getEmployee(String name) {
		return new Employee(1, name);
	}
	public Employee getEmployeeId(long id) {
		return new Employee(id, "World!");
	}
}
