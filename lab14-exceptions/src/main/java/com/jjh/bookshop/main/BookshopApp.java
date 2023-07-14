package com.jjh.bookshop.main;

import com.jjh.bookshop.domain.Book;
import com.jjh.bookshop.domain.Sales;
import com.jjh.bookshop.shop.Bookshop;

import java.util.List;
import java.util.stream.Collectors;

public class BookshopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java Bookshop");

		Bookshop bookshop = new Bookshop();

		for (Book book : bookshop.getBooks()) {
			System.out.println("Book: " + book);
		}

		bookshop.getBooks()
				// .stream()
				// .forEach(b -> System.out.println(b));
				.forEach(System.out::println);

		if (bookshop.isEmpty()) {
			Book book1 = bookshop.get(0);
			book1.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + book1.calculateSalePrice());
			book1.getAuthor().prettyPrint();
			book1.getPublisher().prettyPrint();
		}

		if (bookshop.size() > 1) {
			Sales salesProduct = bookshop.get(1);
			salesProduct.setSaleDiscount(10.0);
			System.out.println("Sale price of book: " + salesProduct.calculateSalePrice());
		}

		System.out.println();

		List<Book> expensiveBooks = bookshop.getBooks()
				.stream()
				.filter(b -> b.getPrice() > 13.00)
				.collect(Collectors.toList());
		System.out.println(expensiveBooks);
	}

}
