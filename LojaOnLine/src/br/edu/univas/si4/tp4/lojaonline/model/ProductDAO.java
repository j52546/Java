package br.edu.univas.si4.tp4.lojaonline.model;

import java.util.ArrayList;

public class ProductDAO {
	
	public ArrayList<Product> listByName(String name){
	
		ArrayList<Product> result = new ArrayList<>();
		
		result.add(new Product("Arroz", 10));
		result.add(new Product("Feijao", 20));
		result.add(new Product("Farinha", 15));
		result.add(new Product("Macarr�o", 25));
		
		
		return result;
		
	}

}
