package com.tanqui.springbootproperties2.spring_value_defaults;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@PropertySource(name = "myProperties", value = "valueWithDefault.properties")
public class ValueWithDefaultsApp {

    @Value("${some.key:my default value}")
    private String stringWithDefaultValue;

    @Value("${some.key:}")
    private String stringWithBlankDefaultValue;

    @Value("${some.key:true}")
    private boolean booleanWithDefaultValue;

    @Value("${some.key:42}")
    private int intWithDefaultValue;

    @Value("${some.key:one,two,three}")
    private String[] stringArrayWithDefaults;

    @Value("${some.key:1,2,3}")
    private int[] intArrayWithDefaults;

    @Value("#{systemProperties['some.key'] ?: 'my default system property value'}")
    private String spelWithDefaultValue;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueWithDefaultsApp.class);
    }

    @PostConstruct
    public void afterInitialize() {
        System.out.println(stringWithDefaultValue);
        System.out.println(stringWithBlankDefaultValue);
        System.out.println(booleanWithDefaultValue);
        System.out.println(intWithDefaultValue);
        System.out.println(Arrays.toString(stringArrayWithDefaults));
        System.out.println(Arrays.toString(intArrayWithDefaults));
        System.out.println(spelWithDefaultValue);
    }
}
