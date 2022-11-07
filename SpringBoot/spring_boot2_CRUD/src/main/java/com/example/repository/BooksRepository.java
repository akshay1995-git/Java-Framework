package com.example.repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

	// Default method
	// findById,findAll,save(object),delete(id)

	// Custom finder method
	// if you want to retrieve data by some other criteria then need to implement
	// custom finder method

	// public List<Book> findbyAuthor(String author_name)
	// by default above method execute--select * from Book where author_name="name";

	public Books findByPrice(int price);
	// --------------------------------------------------------------------------------//
	/*
	 * On Top Of that still if you want to execute complex Query based on some other
	 * criteria then need to execute JPQL(HQL) or native Query(SQL) So whatever
	 * Query you have bind that query with custom method in @Query annotation
	 * 
	 * By JPQL
	 * // @Query("select b from Book b WHERE b.author_name=:nm") 
	 * // public Book getByAuthor(@Param("nm") String name);
	 * 
	 * By Native Query
	 * // @Query(value="select * from Book b WHERE b.author_name = ?",nativeQuery=true ) 
	 * // public Book getByAuthor(String name);	 * 
	 * 
	 */

}
