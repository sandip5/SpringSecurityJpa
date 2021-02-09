package com.sandip.spring.securityjpa.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecurityjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityjpaApplication.class, args);
	}

}
