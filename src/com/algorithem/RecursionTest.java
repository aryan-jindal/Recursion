package com.algorithem;

public class RecursionTest {

	public static void main(String[] args) {
		/*
		 * Bag bag = new Bag();
		 * 
		 * bag.pack();
		 * 
		 * System.out.println(bag.getItems());
		 * 
		 * bag.unPack();
		 * 
		 * System.out.println(bag.getItems());
		 */
		
		CallManager call = new CallManager();
		
		call.addCaller();
		
		System.out.println(call.getCaller());
		
		call.removeCaller();
		
		System.out.println(call.getCaller());
	}
}
