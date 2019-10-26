package com.samhitha.mywebapp;

import java.util.Date;

//import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class StudentServiceDelegate {
	
	 @Autowired
	    RestTemplate restTemplate;
	 @HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback")
	    public String callStudentServiceAndGetData(String bookTitle) {
	 
	        System.out.println("Getting School details for " + bookTitle);
	 
	        String response = restTemplate
	                .exchange("http://localhost:8081/api/books/title/{bookTitle}"
	                , HttpMethod.GET
	                , null
	                , new ParameterizedTypeReference<String>() {
	            }, bookTitle).getBody();
	 
	        System.out.println("Response Received as " + response + " -  " + new Date());
	 
	        return "NORMAL FLOW !!! - School Name -  " + bookTitle + " :::  " +
	                    " Student Details " + response + " -  " + new Date();
	    }
	 
	 @SuppressWarnings("unused")
	    private String callStudentServiceAndGetData_Fallback(String bookTitle) {
	 
	        System.out.println("Student Service is down!!! fallback route enabled...");
	 
	        return "CIRCUIT BREAKER ENABLED!!! No Response From Book Service at this moment. " +
	                    " Service will be back shortly - " + new Date();
	    }
	 
	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
