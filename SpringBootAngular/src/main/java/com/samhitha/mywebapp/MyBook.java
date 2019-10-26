package com.samhitha.mywebapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyBook {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    private  String bookname;
    private  String authoremail;
    private  String author;
	public MyBook() {
		super();
	}
	public MyBook(long id, String bookname, String authoremail, String author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authoremail = authoremail;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthoremail() {
		return authoremail;
	}
	public void setAuthoremail(String authoremail) {
		this.authoremail = authoremail;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
