package com.krishantha.traning.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.krishantha.traning.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

@Override
public List<Employee> getAllEmployees() {
	List<Employee> employees = new ArrayList<>();
	Employee employee = new Employee();
	employee.setEmployeeLocation("Devmina");
	employee.setEmployeeName("Matara");
	employees.add(employee);
	return employees;
	}
}
