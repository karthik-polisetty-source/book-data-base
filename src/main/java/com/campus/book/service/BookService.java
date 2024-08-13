package com.campus.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campus.book.entity.Book;
import com.campus.book.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;

	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	public List<Book> allBook() {
		
		return bookRepo.findAll();
	}

	
	
	

}
