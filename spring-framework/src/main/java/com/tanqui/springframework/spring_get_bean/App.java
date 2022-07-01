package com.tanqui.springframework.spring_get_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Object lion1 = context.getBean("lion");
        System.out.println(lion1 instanceof Lion);
        System.out.println(lion1 instanceof Tiger);

        Lion lion2 = context.getBean("lion", Lion.class);
        System.out.println(lion2.getName());

        lion2.setName("Hello");

        Lion lion3 = context.getBean(Lion.class);
        System.out.println(lion3.getName());

        Tiger tiger1 = (Tiger) context.getBean("tiger", "Siberian");
        System.out.println(tiger1.getName());

        Tiger tiger2 = (Tiger) context.getBean("tiger", "Striped");
        System.out.println(tiger2.getName());

        Tiger tiger3 = context.getBean(Tiger.class, "Shere Khan");
        System.out.println(tiger3.getName());
    }
}
