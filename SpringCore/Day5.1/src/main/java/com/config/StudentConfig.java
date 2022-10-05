package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.Student;

@Configuration
@ComponentScan(basePackages="com.app")
public class StudentConfig {
	
	@Bean
	public Student getStudent() {
		Student stud=new Student();
		return stud;
	}

}
