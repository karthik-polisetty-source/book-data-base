package com.campus.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.book.entity.Book;
import com.campus.book.service.BookService;

@RestController
@RequestMapping("/campus/book")
public class BookController {
	
	@Autowired
	BookService bookService;

	@PostMapping("/add")
	public Book insertBook( @RequestBody Book book) {
		System.out.println(book);
		return bookService.addBook(book);
		
	}
	
	@GetMapping("/list")
	public List <Book> listOfBooks()
	{
		return bookService.allBook();
	}
}
