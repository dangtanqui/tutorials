package com.tanqui.springframework.spring_bean_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.tanqui.springframework.spring_bean_annotations")
//@ComponentScan(basePackageClasses = VehicleFactoryConfig.class)
@ComponentScans({
    @ComponentScan(basePackages = "com.tanqui.springframework.spring_bean_annotations"),
    @ComponentScan(basePackageClasses = VehicleFactoryConfig.class)
})
public class VehicleFactoryConfig {

    @Bean
    Engine engine() {
        return new Engine();
    }
}
