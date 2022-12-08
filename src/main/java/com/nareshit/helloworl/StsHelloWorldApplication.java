package com.nareshit.helloworl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsHelloWorldApplication {
     
    private static final String REST_URL="https://www.equifax.com/getScores";

	// changes for HIS-134 
	public static void main(String[] args) {
		SpringApplication.run(StsHelloWorldApplication.class, args);
	}

}
