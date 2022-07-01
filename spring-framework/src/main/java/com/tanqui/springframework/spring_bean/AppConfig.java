package com.tanqui.springframework.spring_bean;

import com.tanqui.springframework.spring_bean.domain.Address;
import com.tanqui.springframework.spring_bean.domain.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class AppConfig {

    @Bean
    public Address getAddress() {
        return new Address("High Street", 1000);
    }
}
