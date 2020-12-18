package com.sw409.Book.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Book.models.Book;
import com.sw409.Book.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	//create a book
	@PostMapping("api/inventory")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	//read books in database
	@GetMapping("api/inventory")
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}
	
	//update a book
	@PutMapping("api/inventory/{bookid}")
	public void updateBook(@PathVariable("bookid") Integer id, @RequestBody Book book) {
		bookService.updateBook(id, book);
	}
	
	//delete a book
	@DeleteMapping("api/books/{bookid}")
	public void deleteBook(@PathVariable("bookid") Integer id) {
		bookService.deleteBook(id);
	}

}
