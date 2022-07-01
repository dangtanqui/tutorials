package com.tanqui.springbootproperties.properties_with_spring;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "database")
@Data
public class Database {

    String url;
    String username;
    String password;
}
