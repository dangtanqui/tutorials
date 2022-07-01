package com.tanqui.springdi2.constructor_injection;

import com.tanqui.springdi2.constructor_injection.domain.Engine;
import com.tanqui.springdi2.constructor_injection.domain.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tanqui.springdi2.constructor_injection")
public class Config {

    @Bean
    public Engine engine() {
        return new Engine("v8", 5);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }
}
