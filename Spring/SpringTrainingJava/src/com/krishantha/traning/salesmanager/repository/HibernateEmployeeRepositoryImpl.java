package com.krishantha.traning.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.krishantha.traning.salesmanager.model.Employee;


@Repository("you-can-use-anyname")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Value("${name}")
	private String employeeName;
	
	@Value("${city}")
	private String employeeCity;

@Override
public List<Employee> getAllEmployees() {
	List<Employee> employees = new ArrayList<>();
	Employee employee = new Employee();
	employee.setEmployeeLocation(employeeName);
	employee.setEmployeeName(employeeCity);
	employees.add(employee);
	return employees;
	}
}
