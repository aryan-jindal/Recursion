package com.algorithem;

import java.io.IOException;

public class CallerTest {

	public static void main(String[] args) throws IOException {
		
		CallManager call = new CallManager();
		
		call.addCaller();
		
		System.out.println(call.getCaller());
		
		call.removeCaller();
		
		System.out.println(call.getCaller());
	}
}


/**
 * 
 * Loop - while, do while, for
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
