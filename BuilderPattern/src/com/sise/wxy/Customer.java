package com.sise.wxy;

public class Customer {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		waiter.setBuilder(new FirstBuilder());
		waiter.Ask();
		waiter.Take();
		waiter.setBuilder(new SecondBuilder());
		waiter.Ask();
		waiter.Take();
	}

}
