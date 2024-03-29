package com.samhitha.mywebapp;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//import antlr.collections.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:8081")

public class BookController {
 
    @Autowired
    private BookRepository bookRepository;
 
    @GetMapping
    public Iterable findAll() {
        return bookRepository.findAll();
    }
 
    @GetMapping("/title/{bookTitle}")
    public java.util.List<Book> findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }
 
    @GetMapping("/{id}")
    public Optional<Book> findOne(@PathVariable Long id) {
        return bookRepository.findById(id);
         // .orElseThrow(BookNotFoundException::new);
    }
 
    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public Book create(@Valid @RequestBody Book book) {
        return bookRepository.save(book);
    }
 
    @PostMapping("/formData")
    public void create(@RequestBody String s) {
       System.out.println(s);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.findById(id);
          //.orElseThrow(BookNotFoundException::new);
        bookRepository.deleteById(id);
    }
 
    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
    	/*
        if (book.getId() != id) {
          throw new BookIdMismatchException();
        }
        */
        bookRepository.findById(id);
         // .orElseThrow(BookNotFoundException::new);
        return bookRepository.save(book);
    }
}
