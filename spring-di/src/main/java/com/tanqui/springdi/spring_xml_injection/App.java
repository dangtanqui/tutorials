package com.tanqui.springdi.spring_xml_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_xml_injection.xml");
        IndexApp indexApp = context.getBean(IndexApp.class);
        System.out.println(indexApp.getServiceValue());
    }
}
