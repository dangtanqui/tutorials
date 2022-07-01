package com.tanqui.springbootproperties2.spring_value_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PriorityProvider priorityProvider = context.getBean(PriorityProvider.class);
        System.out.println(priorityProvider.getPriority());

        CollectionProvider collectionProvider = context.getBean(CollectionProvider.class);
        System.out.println(collectionProvider.getValues());
    }
}
