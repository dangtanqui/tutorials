package com.tanqui;

import com.tanqui.profiles.ProfileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCore2Application {

	@Autowired
	private ProfileManager profileManager;

	public static void main(String[] args) {
		SpringApplication.run(SpringCore2Application.class, args);
	}

}
