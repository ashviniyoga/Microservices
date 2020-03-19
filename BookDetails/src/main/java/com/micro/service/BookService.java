package com.micro.service;

import java.util.List;

import com.micro.model.Book;

public interface BookService {
	public void saveBook(Book b);
	
	public void deleteBook(Book b);
	
	public List<Book> getAllBooks();
	
	

}
