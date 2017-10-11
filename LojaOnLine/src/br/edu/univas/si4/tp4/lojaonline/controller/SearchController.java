package br.edu.univas.si4.tp4.lojaonline.controller;

import br.edu.univas.si4.tp4.lojaonline.model.ProductDAO;
import br.edu.univas.si4.tp4.lojaonline.viwer.ListProductsFrame;
import br.edu.univas.si4.tp4.lojaonline.viwer.MainFrame;

public class SearchController {
	
	private MainFrame mainFrame;
	private ListProductsFrame listProductsFrame;
	private ProductDAO productDAO;
	
	
	public SearchController() {
		
		mainFrame = new MainFrame(this);
		listProductsFrame = new ListProductsFrame(this);
		productDAO = new ProductDAO();
		
	}
	
	public void initialize() {
		//TODO: Implementar...
	}
	
	public void search(String productName) {
		
		//TODO: Implementar...
	}

}
