package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class GreetingController {
	@Autowired
	EmployeeService employeeService;
	
	//url to display the hardcoded value
	@GetMapping("/greeting")
	public String greeting() {
		return "Hello World!";
	}
	//url to display the hardcoded json object
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1,"venki");

	}
	//url to display the hardcoded json object with default and dynamic value
	@GetMapping("/employees")
	public Employee getEmployees(@RequestParam(value = "name", defaultValue = "World") String empname) {
		return employeeService.getEmployee(empname);

	}
	
	//url to display the hardcoded json object with dynamic id pased in url
	@GetMapping("/employees/{id}")
	public Employee getEmployeesId(@PathVariable("id") long id) {
		return employeeService.getEmployeeId(id);

	}
}
