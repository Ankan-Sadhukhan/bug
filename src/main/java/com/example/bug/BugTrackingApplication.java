package com.example.bug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan("com.example.bug.repository.ISearchRepository")

public class BugTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackingApplication.class, args);
	}

	

}
