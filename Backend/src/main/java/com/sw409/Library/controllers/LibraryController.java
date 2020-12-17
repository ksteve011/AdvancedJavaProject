package com.sw409.Library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Library.models.Book;
import com.sw409.Library.service.LibraryService;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
public class LibraryController {

	@Autowired
	LibraryService libraryService;

	// create

	@PostMapping("api/books")
	public Book createStudent(@RequestBody Book book) {
		return libraryService.createEmployee(book);
	}

	// read

	@GetMapping("api/books")
	public List<Book> findAllBooks() {
		return libraryService.findAllBooks();
	}

	// update
	@PutMapping("api/books/{bookid}")
	public void updateStudent(@PathVariable("bookid") Integer id, @RequestBody Book book) {
		libraryService.updateBook(id, book);
	}

	// delete
	@DeleteMapping("api/shelf/{bookid}")
	public void deleteEmployee(@PathVariable("bookid") Integer id) {
		libraryService.deleteBook(id);
	}
}