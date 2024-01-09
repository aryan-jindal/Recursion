package com.algorithem;

import java.io.IOException;

public class BagTest {

	public static void main(String[] args) throws IOException {
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
