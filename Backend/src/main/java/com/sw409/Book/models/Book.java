package com.sw409.Book.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Book {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Id
	private Integer id;
	private String title;
	private String authorName;
	private String booktype;
	
	public Book(Integer id, String title, String authorName, String booktype) {
		super();
		this.id = id;
		this.title = title;
		this.authorName = authorName;
		this.booktype = booktype;
	}
	
	public Book() {
		
	}
	
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


}