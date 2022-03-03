package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.utility.*;

@SpringBootApplication
public class SpringValidationApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringValidationApplication.class, args);
		
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//example//demo//properties//CustUpdate.properties");
		Constants.CustUpdate = new Properties();
		Constants.CustUpdate.load(fs);
	
//		System.out.println(Constants.CustUpdate.getProperty("Status"));
//		System.out.println(Constants.CustUpdate.getProperty("ErrorCode"));
//		System.out.println(Constants.CustUpdate.getProperty("MessageType"));
//		System.out.println(Constants.CustUpdate.getProperty("Message"));
	}
	

}
