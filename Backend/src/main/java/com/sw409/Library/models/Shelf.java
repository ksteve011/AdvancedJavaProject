package com.sw409.Library.models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="shelf")
public class Shelf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String title;
	
	@ManyToOne
	@JsonIgnore
	
	private Book book;
	
	@OneToMany(mappedBy = "module")
	private List<Book> books;

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

	public Book getBook() {
		return book;
	}

	public void setCourse(Book book) {
		this.book = book;
	}

	public List<Book> getBooksOnShelf() {
		return books;
	}

	public void setBooksOnShelf(List<Book> books) {
		this.books = books;
	}
}
