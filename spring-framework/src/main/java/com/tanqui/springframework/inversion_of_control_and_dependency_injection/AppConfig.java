package com.tanqui.springframework.inversion_of_control_and_dependency_injection;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Item item() {
        return new ItemImpl1("Hello");
    }

    @Bean
    public Store storeThroughConstructorInjection() {
        return new Store(item());
    }

//    @Bean
//    public Store storeThroughSetterInjection() {
//        Store store = new Store();
//        store.setItem(item());
//        return store;
//    }

//    @Bean
//    public Store storeThroughFieldInjection() {
//        return new Store();
//    }

//    @Bean(autowire = Autowire.BY_TYPE)
//    public Store storeThroughFieldInjectionByType() {
//        return new Store();
//    }

//    @Bean(autowire = Autowire.BY_NAME)
//    public Store storeThroughFieldInjectionByName() {
//        return new Store();
//    }
}
