package com.rohi.spring_security.service;

import com.rohi.spring_security.entity.Employee;
import com.rohi.spring_security.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> find(Long id) {
        return employeeRepository.findById(id);
    }
}
