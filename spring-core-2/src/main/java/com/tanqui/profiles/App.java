package com.tanqui.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(App.class);
//        app.setAdditionalProfiles("dev");

//        SpringApplication application = new SpringApplication(App.class);
//        ConfigurableEnvironment environment = new StandardEnvironment();
//        environment.setActiveProfiles("dev");
//        application.setEnvironment(environment);
//        application.run(args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringProfilesConfig.class);
        ProfileManager profileManager = context.getBean(ProfileManager.class);
        profileManager.getActiveProfiles();
        DatasourceConfig datasourceConfig = context.getBean(DatasourceConfig.class);
        datasourceConfig.setup();
    }
}
