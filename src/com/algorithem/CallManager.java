package com.algorithem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CallManager {

	private List<String> caller = new ArrayList<>();
	
	public void addCaller() {
		String item = JOptionPane.showInputDialog("Enter caller name");
		if (!item.equals("x")) {
			System.out.println(item  + " is calling");
			caller.add(item);
			addCaller();
		}
		
	}
	
	public void removeCaller() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		if (caller.size() > 0) {
			System.out.println("Enter text to end the call");
	        String text = reader.readLine();
			System.out.println(text);
			if (text.equals("ba ba")) {
				caller.remove(0);
				removeCaller();
			}
		}
		
	}

	public List<String> getCaller() {
		return caller;
	}

	public void setCaller(List<String> caller) {
		this.caller = caller;
	}

	
}
