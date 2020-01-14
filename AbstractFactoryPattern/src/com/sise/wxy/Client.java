package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Factory firstFactory = new FirstFactory();
		firstFactory.TakeFirstProduce().CreateFirstProduce();
		firstFactory.TakeSecondProduce().CreateSecondProduce();
		Factory secondFactory = new SecondFactory();
		secondFactory.TakeFirstProduce().CreateFirstProduce();
		secondFactory.TakeSecondProduce().CreateSecondProduce();
	}

}
