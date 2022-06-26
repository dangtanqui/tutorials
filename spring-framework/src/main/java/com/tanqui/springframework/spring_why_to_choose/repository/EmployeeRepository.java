package com.tanqui.springframework.spring_why_to_choose.repository;

import com.tanqui.springframework.spring_why_to_choose.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();
}
