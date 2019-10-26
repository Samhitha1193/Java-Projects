package com.samhitha.mywebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookServiceController {

	@Autowired
    StudentServiceDelegate studentServiceDelegate;
 
    @RequestMapping(value = "/api/books/title/{bookTitle}", method = RequestMethod.GET)
    public String getStudents(@PathVariable String bookTitle) {
        System.out.println("Going to call student service to get data!");
        return studentServiceDelegate.callStudentServiceAndGetData(bookTitle);
    }
	
}
