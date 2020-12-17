package com.sw409.Library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Library.models.Book;
import com.sw409.Library.repositories.LibraryRepository;

@Service	
public class LibraryService {


		@Autowired
		LibraryRepository libraryRepository;
		
		//we will be creating create, read, update, and delete methods
		List<Book> employeeList = new ArrayList<>();
		
		//create
		public Book createEmployee(Book book) 
		{
			employeeList.add(book);		
			return book;
		}
		
		//read
		public List<Book> findAllBooks()
		{
			return (List<Book>) libraryRepository.findAll();
		}
		
		//update
		public void updateBook(Integer id, Book book)
		{
			for (int i = 0; i < employeeList.size(); i++) {
				if(employeeList.get(i).getId().equals(id)) {
					employeeList.set(i, book);
				}
			}
		}
		
		//delete
		public void deleteBook(Integer id)
		{
			for (int i = 0; i < employeeList.size(); i++) {
				if(employeeList.get(i).getId() == id)
				{
					employeeList.remove(i);
				}
			}
		}
		
}


