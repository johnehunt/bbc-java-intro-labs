package com.jjh.bookshop.domain;

/**
 * Book is a type of product that has an author and a publisher.
 */
public class Book extends Product {
	private Author author;
	private Publisher publisher;

	public Book(String title, Author author, Publisher publisher, double price) {
		super(title, price);
		this.author = author;
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return String.format("Book(title=%s, author=%s, price %s, publisher=%s, discount=%s]",
				getTitle(), author, getPrice(), publisher, getSalePercentage());
	}

}
