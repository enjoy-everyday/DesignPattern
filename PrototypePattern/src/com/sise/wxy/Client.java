package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Prototype firstPrototype = new FirstPrototype();
		System.out.println(firstPrototype.getName());
		Prototype secondPrototype = new SecondPrototype();
		System.out.println(secondPrototype.getName());
	}

}
