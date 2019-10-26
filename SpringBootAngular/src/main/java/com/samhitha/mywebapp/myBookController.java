package com.samhitha.mywebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class myBookController {
 
    // standard constructors
     
	@Autowired
    private  BookRepo userRepository;
 
    @GetMapping("/books")
    public List<MyBook> getUsers() {
        return (List<MyBook>) userRepository.findAll();
    }
 
    @PostMapping("/addbooks")
    void addUser(@RequestBody MyBook book) {
        userRepository.save(book);
    }
}
