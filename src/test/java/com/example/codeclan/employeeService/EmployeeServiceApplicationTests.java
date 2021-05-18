package com.example.codeclan.employeeService;

import com.example.codeclan.employeeService.models.Employee;
import com.example.codeclan.employeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("James Blunt", 40, "AB12345", "james.blunt@music.com");
		employeeRepository.save(employee);
		Employee employee2 = new Employee("James Franco", 32, "JF34567", "james.franco@music.com");
		employeeRepository.save(employee2);
	}

}
