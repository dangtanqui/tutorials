package com.tanqui.springframework.first_project;

import com.tanqui.springframework.first_project.entity.Employee;
import com.tanqui.springframework.first_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = new Employee("Đặng Tấn", "Quí");
        Employee employee2 = new Employee("Dương Thị", " Lệ Thúy");
        List<Employee> employees = Arrays.asList(employee1, employee2);
        employeeRepository.saveAll(employees);
//        username: user
//        password: copy pass khi chạy xong
    }
}
