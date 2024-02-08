package com.demo.springsparkcassandra;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SpringSparkCassandraApplication {
	@Bean
	CommandLineRunner commandLineRunner(com.demo.springsparkcassandra.repo.EmployeeRepository employeeRepository){
		return args -> {
			log.info("-----------" + employeeRepository.countEmp() + "-----------");
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSparkCassandraApplication.class, args);
	}
}
