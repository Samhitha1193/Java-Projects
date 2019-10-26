package com.example.samhitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Project2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Project2Application.class, args);
		Alien a=context.getBean(Alien.class);
		a.show();
		
	}

}
