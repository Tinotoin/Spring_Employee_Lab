package com.codeclan.example.Employees;

import com.codeclan.example.Employees.models.Department;
import com.codeclan.example.Employees.models.Employee;
import com.codeclan.example.Employees.repositories.DepartmentRepository;
import com.codeclan.example.Employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void anAddEmployee(){
		Department department = new Department("Weaponry");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Smith", 12345, department);
		employeeRepository.save(employee);


	}

}
