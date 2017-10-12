package br.edu.univas.si4.tp4.lojaonline.model;

public class Product {
	
	private String name;
	private int quantity;
	
	
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getQuantity() {
		return quantity;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + "]";

	}
}	
