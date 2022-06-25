package com.tanqui.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee.getName());

        ManagerService service = context.getBean(ManagerService.class);
        Manager manager = service.getManager();
        System.out.println(manager.getManagerName());
    }
    
}
