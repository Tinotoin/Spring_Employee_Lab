package com.codeclan.example.Employees.controllers;

import com.codeclan.example.Employees.models.Employee;
import com.codeclan.example.Employees.repositories.DepartmentRepository;
import com.codeclan.example.Employees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
