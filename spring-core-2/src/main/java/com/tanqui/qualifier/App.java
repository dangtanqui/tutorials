package com.tanqui.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FooService fooService = ctx.getBean(FooService.class);
        System.out.println(fooService.doStuff());

        Employee employee = ctx.getBean(Employee.class);
        System.out.println(employee.getName());
    }
}
