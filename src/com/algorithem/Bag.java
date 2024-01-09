package com.algorithem;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Bag {

	private List<String> items = new ArrayList<>();
	
	public void pack() {
		String item = JOptionPane.showInputDialog("Enter Item to Pack");
		System.out.println(item);
		if (item != null && item.length() > 0) {
			items.add(item);
			pack(); //Recursive call
		}
		
	}
	
	public void unPack() {
		String item = JOptionPane.showInputDialog("Enter Item to Unpack");
		System.out.println(item);
		if (item != null && item.length() > 0) {
			items.remove(item);
			unPack();  //Recursive call
		}
		
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
}
