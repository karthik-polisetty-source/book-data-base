package com.campus.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class BookDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDataBaseApplication.class, args);
	}

}
