package com.emailtest.tast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TastApplication {

	public static void main(String[] args) {
		SpringApplication.run(TastApplication.class, args);
	}

}
