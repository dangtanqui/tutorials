package com.tanqui.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FooService fooService = ctx.getBean(FooService.class);
        System.out.println(fooService.doStuff());
    }
}
