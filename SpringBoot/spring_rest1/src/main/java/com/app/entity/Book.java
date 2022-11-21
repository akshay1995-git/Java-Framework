package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table(name="book_table")
public class Book
{
//Defining book id as primary key
@Id
@Column
private int bookid;
@Column
private String bookname;
@Column
private String author;
@Column
private int price;


public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bookid, String bookname, String author, int price) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.author = author;
	this.price = price;
}
public int getBookid() 
{
return bookid;
}
public void setBookid(int bookid) 
{
this.bookid = bookid;
}
public String getBookname()
{
return bookname;
}
public void setBookname(String bookname) 
{
this.bookname = bookname;
}
public String getAuthor() 
{
return author;
}
public void setAuthor(String author) 
{
this.author = author;
}
public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
}

}