package com.intershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceMonitorApplication {

	public static void main(String[] args) {
		System.out.println("Application has started.");
		SpringApplication.run(ServiceMonitorApplication.class, args);
	}
}
