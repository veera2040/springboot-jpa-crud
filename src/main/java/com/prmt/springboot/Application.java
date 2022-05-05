package com.prmt.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.prmt.springboot.model"})  // force scan JPA entities
//@ComponentScan()
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
