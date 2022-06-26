package com.tanqui.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceConfig implements DatasourceConfig {

    @Value("${a}")
    private String name;

    @Override
    public void setup() {
        System.out.println("Setting up datasource for DEV environment. ");
        System.out.println(name);
    }
}
