package com.samhitha.mywebapp;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler {
	
	
	 // private static final Class<? extends Throwable>[] BookNotFoundException = null;

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	      HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorDetails book = new ErrorDetails(1233445, "Validation Failed",
	        ex.getBindingResult().toString());
	    return new ResponseEntity(book, HttpStatus.BAD_REQUEST);
	  } 
	
	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<Book> handleUserNotFoundException(BookNotFoundException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(8786778, ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	  }

}
