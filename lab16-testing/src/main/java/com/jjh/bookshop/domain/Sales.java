package com.jjh.bookshop.domain;

public interface Sales {

	void setSaleDiscount(double salePercentage);

	double calculateSalePrice();

}
