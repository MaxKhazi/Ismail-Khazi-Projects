package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories(basePackages="com.Repo")
@EntityScan("com.bean")

public class XyzNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyzNewsApplication.class, args);
	    System.out.println("News server started on port no 9090");
	    
	}

}
