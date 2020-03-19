package com.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	Book findByBookName(String name);

}
