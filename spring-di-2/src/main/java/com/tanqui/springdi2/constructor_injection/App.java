package com.tanqui.springdi2.constructor_injection;

import com.tanqui.springdi2.constructor_injection.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Car car = context.getBean(Car.class);

        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection.xml");
        Car car = context.getBean(Car.class);
    }
}
