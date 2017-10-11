package br.edu.univas.si4.tp4.lojaonline.model;

public class Product {
	
	private String name;
	private int quatity;
	
	
	public Product(String name, int quatity) {
		super();
		this.name = name;
		this.quatity = quatity;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getQuatity() {
		return quatity;
	}
	private void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	
	

}
