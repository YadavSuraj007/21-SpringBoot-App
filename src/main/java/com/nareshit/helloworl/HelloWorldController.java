package com.nareshit.helloworl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "Welcome to Spring Boot Through STS And Git repository ";
	}

}
