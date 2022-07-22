package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.krishantha.traning.salesmanager.repository.EmployeeRepository;
import com.krishantha.traning.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.traning.salesmanager.service.EmployeeService;
import com.krishantha.traning.salesmanager.service.EmployeeServiceImpl;


@Configuration
@ComponentScan("com.krishantha")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean("employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}

	@Bean("employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
