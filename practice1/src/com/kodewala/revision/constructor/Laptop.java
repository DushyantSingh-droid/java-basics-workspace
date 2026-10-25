package com.kodewala.revision.constructor;

public class Laptop {
	String name;
	String ram;
	String storage;
	static int count ;
        public Laptop(String name,String ram,String storage) {
        	this.name = name;
        	this.ram = ram;
        	this.storage = storage;
        	count++;
        	System.out.println("++++++");
        }
        public void showDetails() {
        	System.out.println("Name : "+ name);
        	System.out.println("Ram : "+ ram);
        	System.out.println("Storage : "+ storage);
        	System.out.println("COUNT : "+ count);
        }
}
class ScreenTouch extends Laptop{
	String hz;
	public ScreenTouch(String name, String ram,String hz ) {
		super(name, ram, "512");	
		this.hz = hz;
		System.out.println("------");
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Hz : "+ hz);
	}
}
class Fold180 extends ScreenTouch{
	String foldWarranty;
	public Fold180(String name,String hz,String foldWarranty) {
		super(name,"8",hz);
		this.foldWarranty = foldWarranty;
		System.out.println("*******");
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Fold Warranty : "+ foldWarranty + " Years");
	}
}
