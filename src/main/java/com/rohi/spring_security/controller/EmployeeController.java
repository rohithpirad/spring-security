package com.rohi.spring_security.controller;

import com.rohi.spring_security.entity.Employee;
import com.rohi.spring_security.entity.User;
import com.rohi.spring_security.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/fetch/{employee_id}")
    private ResponseEntity<Object> getUserInfo(@PathVariable Long employee_id) {
        Optional<Employee> emp;
        try {
            emp = employeeService.find(employee_id);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (emp.isPresent()) return ResponseEntity.ok(emp.get());
        return ResponseEntity.ok("No employee found with id " + employee_id);
    }

    @PostMapping("/save")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        try {
            Employee emp = employeeService.create(employee);
            return ResponseEntity.ok("employee inserted successfully with employeeId " + emp.getId());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Something went wrong on employee " + employee.getName() + " creation with error " + e.getMessage());
        }
    }
}
