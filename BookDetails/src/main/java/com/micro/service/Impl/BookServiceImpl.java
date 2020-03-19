package com.micro.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.Repository.BookRepository;
import com.micro.model.Book;
import com.micro.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public void saveBook(Book b) {
		// TODO Auto-generated method stub
		bookRepo.save(b);
	}

	@Override
	public void deleteBook(Book b) {
		// TODO Auto-generated method stub
		System.out.println("Inside the delete Price");
		bookRepo.delete(b);

	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		System.out.println("Inside the getAllPrice () in Price Impl pkg");
		return bookRepo.findAll();
	}
 

}
