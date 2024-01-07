package com.algorithem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CallManager {

	private List<String> caller = new ArrayList<>();
	
	public void addCaller() {
		String item = JOptionPane.showInputDialog("Enter caller name");
		System.out.println(item  + " is calling");
		if (!item.equals("x")) {
			caller.add(item);
			addCaller();
		}
		
	}
	
	public void removeCaller() {
		System.out.println("End call");
		
        String s = "";
		System.out.println(s);
		if (caller.size() > 0) {
			if (s.equals("ba ba")) {
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
