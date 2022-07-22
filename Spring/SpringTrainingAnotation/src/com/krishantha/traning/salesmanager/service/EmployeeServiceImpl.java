package com.krishantha.traning.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.traning.salesmanager.model.Employee;
import com.krishantha.traning.salesmanager.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository EmployeeRepository;

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(){
		System.out.println("Default constructor executted");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded constructor executted");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter inection fired");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
}
