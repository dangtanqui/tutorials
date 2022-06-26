package com.tanqui.springframework.spring_why_to_choose.controller;

import com.tanqui.springframework.spring_why_to_choose.entity.Employee;
import com.tanqui.springframework.spring_why_to_choose.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

}
