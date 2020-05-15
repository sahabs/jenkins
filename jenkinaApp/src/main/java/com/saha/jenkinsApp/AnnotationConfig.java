package com.saha.jenkinsApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.saha.jenkinsApp")
public class AnnotationConfig {
	/*
	@Bean
	public Bike getBike() {
		return new Bike();
	}
	
	@Bean
	public BikeTyre getBikeTyre() {
		return new BikeTyre();
	}
	*/

}
