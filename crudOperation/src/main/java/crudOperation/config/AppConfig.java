package crudOperation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import crudOperation.entity.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student student(){
		return new Student();
	}
}
