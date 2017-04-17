package com.atguigu.ioc.bean;

public class Book {
	private String author;
	private String bookName;
	private double price;
	private String bookId;
	public Book() {
		super();
	}
	public Book(String author, String bookName, double price, String bookId) {
		super();
		this.author = author;
		this.bookName = bookName;
		this.price = price;
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", bookName=" + bookName + ", price=" + price + ", bookId=" + bookId + "]";
	}
	
}
