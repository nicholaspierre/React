package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringCoreProjectApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringCoreProjectApplication.class, args);
		ConfigurableApplicationContext Context = SpringApplication.run(SpringCoreProjectApplication.class, args);
		System.out.println("Springboot App is Running");
		
		Person p1 = Context.getBean(Person.class);
		p1.show();
		
		Employee p2 = Context.getBean(Employee.class);
		p2.show();
	}

}
