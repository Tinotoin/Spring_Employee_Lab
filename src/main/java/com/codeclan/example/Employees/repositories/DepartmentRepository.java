package com.codeclan.example.Employees.repositories;

import com.codeclan.example.Employees.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
