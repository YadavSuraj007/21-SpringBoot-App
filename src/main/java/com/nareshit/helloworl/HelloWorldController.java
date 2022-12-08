package com.nareshit.helloworl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "Welcome to Spring Boot Through STS And Git repository // changes for TECH-M 122//";
	}
           // HIS-2000 related changes
         public void doProcess(){
            // logic goes here 
      
}

}
