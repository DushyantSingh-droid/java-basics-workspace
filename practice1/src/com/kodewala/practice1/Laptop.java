package com.kodewala.practice1;

public class Laptop {
	private final String brand;
	private final int ram;
	private final int storage;
	private static int count;

	public Laptop(String brand, int ram, int storage) {
		if (brand == null) {
			throw new IllegalArgumentException("brand can not be blank");
		}
		if (brand.trim().isEmpty()) {
			throw new IllegalArgumentException("brand can not be blank");
		}
		if (ram < 0 && storage < 0) {
			throw new IllegalArgumentException("ram and storage must be positive");
		}
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		count++;

	}

	public Laptop(String brand, int ram) {
		this(brand, ram, 512);

	}

	public Laptop(String brand) {
		this(brand, 8);
	}

	public static int getCount() {
		return count;
	}

	public void showDetails() {
		System.out.println("The Brand Is : " + brand);
		System.out.println("The RAM Is : " + ram);
		System.out.println("The Storage Is : " + storage);
	}
}
