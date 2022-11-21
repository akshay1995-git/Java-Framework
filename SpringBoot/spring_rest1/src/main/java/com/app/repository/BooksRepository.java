package com.app.repository;



import org.springframework.data.repository.CrudRepository;

import com.app.entity.Book;



public interface BooksRepository extends CrudRepository<Book, Integer> {



}
