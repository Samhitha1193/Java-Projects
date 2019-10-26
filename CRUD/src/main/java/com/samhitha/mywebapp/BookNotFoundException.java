package com.samhitha.mywebapp;
public class BookNotFoundException extends RuntimeException {
	 
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    // ...
}