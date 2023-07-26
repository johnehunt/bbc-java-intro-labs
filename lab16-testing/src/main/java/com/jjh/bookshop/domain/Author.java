package com.jjh.bookshop.domain;

public final class Author extends Contact {
	
	private String genre;

	public Author(String name, Address address, String genre) {
	    super(name, address);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void prettyPrint() {
		System.out.printf("Author [name=%s, address=%s]%n", getName(), getAddress());
	}

	@Override
	public String toString() {
		return String.format("Author genre=%s, %s", genre, super.toString());
	}

}
