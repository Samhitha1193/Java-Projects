package com.samhitha.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samhitha.entity.User28;
//import com.samhitha.mywebapp.Book;
import com.samhitha.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User28> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    @ResponseBody()
    public User28 addNewUser(@RequestBody User28 user) {
        return this.userService.addUser(user);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
    	userService.findById(id);
          //.orElseThrow(BookNotFoundException::new);
    	userService.deleteById(id);
    }
    
    @PutMapping("/{id}")
    public User28 updateBook(@RequestBody User28 user, @PathVariable Integer id) {
    	/*
        if (book.getId() != id) {
          throw new BookIdMismatchException();
        }
        */
    	userService.findById(id);
         // .orElseThrow(BookNotFoundException::new);
        return userService.addUser(user);
    }

}
