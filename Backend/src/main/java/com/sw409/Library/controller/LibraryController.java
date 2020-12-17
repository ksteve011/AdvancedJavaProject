package com.sw409.Library.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Library.models.Book;
import com.sw409.Library.services.LibraryService;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
public class LibraryController {

	@Autowired
	LibraryService libraryService;
	@GetMapping("api/library")
	public ArrayList<Book>getAllBooks(){
		
		return libraryService.getAllBooks();
	}
	
}