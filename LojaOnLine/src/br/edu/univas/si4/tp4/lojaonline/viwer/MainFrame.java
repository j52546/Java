package br.edu.univas.si4.tp4.lojaonline.viwer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.CORBA.INITIALIZE;

import br.edu.univas.si4.tp4.lojaonline.controller.SearchController;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private SearchController controller;
	
	private JTextField searchField;
	private JButton searchButton;
	
	public MainFrame(SearchController controller) {
		super("Main Window");
		this.controller = controller;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		
		
	}
	
	private void initialize() {
		setLayout(new FlowLayout());
		
		add(getSearchButton());
		add(getSearchField());
		
	}

	private JTextField getSearchField(){
		if(searchField == null) {
			searchField = new JTextField();
			searchField.setColumns(20);
		}
		return searchField;
	}
	
	private void seachClicked() {
		
		String nome = getSearchField().getText();
		controller.search(nome);
		
	}

	private JButton getSearchButton() {
		if(searchButton == null) {
			searchButton = new JButton();
			searchButton.setText("Search");
			searchButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					searchClicked();
					
				}
			});
		}
		return searchButton;
	}
	

	private void setSearchButton(JButton searchButton) {
		this.searchButton = searchButton;
	}

	private void setSearchField(JTextField searchField) {
		this.searchField = searchField;
	}
	
	private void searchClicked() {
		String productName = getSearchField().getText();
		controller.search(productName);
	}
	
}
