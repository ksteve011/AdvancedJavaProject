package com.sw409.Book.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.Book.models.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	
	

}
