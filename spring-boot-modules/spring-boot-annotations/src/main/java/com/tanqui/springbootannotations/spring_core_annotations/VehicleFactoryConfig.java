package com.tanqui.springbootannotations.spring_core_annotations;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.tanqui.springbootannotations.spring_core_annotations")
@ComponentScan(basePackageClasses = VehicleFactoryConfig.class)
@ImportResource("classpath:/annotations.xml")
@PropertySource("classpath:/annotations.properties")
@Lazy
public class VehicleFactoryConfig {

    @Bean
    @Lazy(false)
    Engine engine() {
        return new Engine();
    }
}
