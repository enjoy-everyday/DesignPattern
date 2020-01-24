package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Original former = new Former();
		Original firstDecorator = new FirstDecorator(new Former());
		Original secondDecorator = new SecondDecorator(new Former());
		former.origin();
		firstDecorator.origin();
		secondDecorator.origin();
	}

}
