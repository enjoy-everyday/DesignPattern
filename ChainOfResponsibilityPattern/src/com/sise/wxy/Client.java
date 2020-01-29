package com.sise.wxy;

public class Client {
	
	public static void main(String[] args) {
		Handler threeHandler = new ThreeHandler();
		Handler secondHandler = new SecondHandler();
		Handler firstHandler = new FirstHandler();
		
		threeHandler.setHandler(secondHandler);
		secondHandler.setHandler(firstHandler);
		
		threeHandler.request(50);
	}
	
}
