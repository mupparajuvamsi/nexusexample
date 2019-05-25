package com.example.crudrestapiexample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;

//method for saving employee details
	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
	public void createEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);

	}

	// method for getting all employee details
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);

	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeRepository.delete(employee);

	}

}
