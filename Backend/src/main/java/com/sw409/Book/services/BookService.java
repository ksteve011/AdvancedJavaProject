package com.sw409.Book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Book.models.Book;
import com.sw409.Book.repositories.BookRepository;

@Service	
public class BookService {


		@Autowired
		BookRepository bookRepository;
		
		//we will be creating create, read, update, and delete methods
		List<Book> bookList = new ArrayList<>();
		
		//create
		public Book createBook(Book book) 
		{
			bookList.add(book);		
			return book;
		}
		
		//read
		public List<Book> findAllBooks()
		{
			return (List<Book>) bookRepository.findAll();
		}
		
	
		//update
		public void updateBook(Integer id, Book book)
		{
			for (int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getId().equals(id)) {
					bookList.set(i, book);
				}
			}
		}
		
		//delete
		public void deleteBook(Integer id)
		{
			for (int i = 0; i < bookList.size(); i++) {
				if(bookList.get(i).getId() == id)
				{
					bookList.remove(i);
				}
			}
		}
		
}


