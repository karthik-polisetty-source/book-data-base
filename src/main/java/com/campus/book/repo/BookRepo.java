package com.campus.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campus.book.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
