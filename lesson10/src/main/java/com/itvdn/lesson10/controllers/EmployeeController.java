package com.itvdn.lesson10.controllers;

import com.itvdn.lesson10.dao.Employee;
import com.itvdn.lesson10.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(e->employees.add(e));
        return employees;
    }
    @PostMapping("/employee/post")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity(HttpStatus.OK);
    }
}
