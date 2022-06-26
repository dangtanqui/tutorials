package com.tanqui.profiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tanqui.profiles")
@PropertySource({"classpath:application.properties", "classpath:application-dev.properties", "classpath:application-prod.properties"})
public class SpringProfilesConfig {
}
