package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;
import com.app.service.BooksService;




@RestController
public class AppController {

	//autowire the BooksService class
		@Autowired
		BooksService booksService;
		
		//creating post mapping that post the book detail in the database
		@PostMapping("/books")
		private int saveBook(@RequestBody Book books) {
			booksService.saveOrUpdate(books);
			return books.getBookid();
		}
		
		//creating a get mapping that retrieves all the books detail from the database 
		@GetMapping("/book")
		private List<Book> getAllBooks() {
			return booksService.getAllBooks();
		}

	//creating a get mapping that retrieves the detail of a specific book
		@GetMapping("/book/{bookid}")
		private Book getBooks(@PathVariable("bookid") int bookid) {
			return booksService.getBooksById(bookid);
		}

		
		//creating a delete mapping that deletes a specified book
		@DeleteMapping("/book/{bookid}")
		private void deleteBook(@PathVariable("bookid") int bookid) {
			booksService.delete(bookid);

		}
		//creating put mapping that updates the book detail 
		@PutMapping("/books")
		private Book update(@RequestBody Book books) {
			booksService.saveOrUpdate(books);
			return books;
		}
}
