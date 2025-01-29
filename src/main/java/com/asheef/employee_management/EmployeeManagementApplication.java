package com.asheef.employee_management;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.asheef.employee_management.mysql_repository") // MySQL Repos
//@EnableMongoRepositories(basePackages = "com.asheef.employee_management.mongo_repository")
//@EntityScan(basePackages = "com.asheef.employee_management.model_mysql")
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
