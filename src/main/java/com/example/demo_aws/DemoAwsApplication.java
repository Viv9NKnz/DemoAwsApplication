package com.example.demo_aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class DemoAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAwsApplication.class, args);

	}
@GetMapping("/")
    public String healthCheck() {
        return "¡Hola! La aplicación Spring Boot ha sido construida y desplegada desde AWS CodeBuild.";

	}

}
