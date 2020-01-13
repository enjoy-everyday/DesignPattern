package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Factory firstFactory = new FirstFactory();
		firstFactory.Take().Create();
		Factory secondFactory = new SecondFactory();
		secondFactory.Take().Create();
	}

}
