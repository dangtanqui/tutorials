package com.tanqui.springframework.inversion_of_control_and_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Store store = context.getBean(Store.class);
        store.print();

//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-context.xml");
//        Store store = context.getBean(Store.class);
//        store.print();
    }
}
