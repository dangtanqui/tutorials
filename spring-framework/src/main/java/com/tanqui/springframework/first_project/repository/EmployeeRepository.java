package com.tanqui.springframework.first_project.repository;

import com.tanqui.springframework.first_project.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();
}
