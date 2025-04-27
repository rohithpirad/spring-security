package com.rohi.spring_security.repository;

import com.rohi.spring_security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
