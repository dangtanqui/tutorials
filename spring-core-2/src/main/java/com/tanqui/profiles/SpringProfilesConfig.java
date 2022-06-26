package com.tanqui.profiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.tanqui.profiles")
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:application-${spring.profiles.active}.properties")
})
//@PropertySource({"classpath:application.properties", "classpath:application-${spring.profiles.active}.properties"})
public class SpringProfilesConfig {
}
