package com.tanqui.springframework.spring_bean;

import com.tanqui.springframework.spring_bean.domain.Address;
import com.tanqui.springframework.spring_bean.domain.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

//        Address address = new Address("High Street", 1000);
//        Company company = new Company(address);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Company company = context.getBean("company", Company.class);
        System.out.println(company.getAddress().getStreet());
        System.out.println(company.getAddress().getNumber());
    }
}
