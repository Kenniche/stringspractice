package com.kenniche.stringspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringspracticeApplication.class, args);
	}
	
    // 1. Annotation
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello World! How are you doing?";
    }
    // 1. Annotation
    @RequestMapping("/random")
    // 3. Method that maps to the request route above
    public String springboot() { // 3
            return "Spring Boot is great! So easy to just respond with strings";
    }

}
