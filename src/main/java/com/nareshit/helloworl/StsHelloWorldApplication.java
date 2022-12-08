package com.nareshit.helloworl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsHelloWorldApplication {
<<<<<<< Feature-301
public static void(){
}
	
=======
     
    private static final String REST_URL="https://www.equifax.com/getScores";

	// changes for HIS-134 
>>>>>>> developer
	public static void main(String[] args) {
		SpringApplication.run(StsHelloWorldApplication.class, args);
	}
                // HIS-301 changes
              public void loadDataToCatch(){
                  // logic
                 }

}
