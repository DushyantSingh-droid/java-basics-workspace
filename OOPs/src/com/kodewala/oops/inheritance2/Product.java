package com.kodewala.oops.inheritance2;

class Product {
	String name;
	int quantity;

	public Product(String name, int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantity Not Valid");
		}
		this.name = name;
		this.quantity = quantity;
	}

	public void productDetails() {
		System.out.println(name);
		System.out.println(quantity);
	}
}

class ElectronicProduct extends Product {
	int warranty;

	public ElectronicProduct(String name, int quantity, int warranty) {
		super(name, quantity);
		this.warranty = warranty;
	}

	@Override
	public void productDetails() {
		super.productDetails();
		System.out.println(warranty);
	}
}

class Iphone extends ElectronicProduct {
	String updateUpTo;

	public Iphone(String name, int quantity, int warranty, String updateUpTo) {
		super(name, quantity, warranty);
		this.updateUpTo = updateUpTo;
	}

	@Override
	public void productDetails() {
		super.productDetails();
		System.out.println(updateUpTo);
	}
}

class Grocery extends Product {
	String quality;

	public Grocery(String name, int quantity, String quality) {
		super(name, quantity);
		this.quality = quality;
	}

	@Override
	public void productDetails() {
		super.productDetails();
		System.out.println(quality);
	}
}

class Vegetables extends Grocery {
	String product;

	public Vegetables(String name, int quantity, String quality, String product) {
		super(name, quantity, quality);
		this.product = product;
	}

	@Override
	public void productDetails() {
		super.productDetails();
		System.out.println(product);
	}
}
