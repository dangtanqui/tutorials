package com.tanqui.springbootproperties.properties_with_spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:bar.properties")
public class PropertiesWithJavaConfigOther {
}
