package com.jjh.bookshop.domain;

public final class Publisher extends Contact implements PrettyPrinter {

	private String organisation;

	public Publisher(String name, Address address, String organisation) {
		super(name, address);
		this.organisation = organisation;
	}

	public String toString() {
		return String.format("Publisher [name=%s, address=%s]", getName(), getAddress());
	}

	public void prettyPrint() {
		System.out.printf("Publisher [name=%s, address=%s]", getName(), getAddress());
	}

}