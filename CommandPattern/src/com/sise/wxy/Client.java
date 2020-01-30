package com.sise.wxy;

public class Client {
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker(new FirstCommand());
		invoker.call();
	}
	
}
