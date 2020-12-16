package com.sw409.Library.repositories;


import org.springframework.data.repository.CrudRepository;

import com.sw409.Library.models.Book;

public interface LibraryRepository extends CrudRepository<Book, Integer> {

	
	

}
