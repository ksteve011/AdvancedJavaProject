package com.sw409.Library.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Library.models.Book;
import  com.sw409.Library.repositories.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	LibraryRepository libraryRepository;
	
	public ArrayList<Book> getAllBooks(){
	
		return (ArrayList<Book>) libraryRepository.findAll();
	}
}
