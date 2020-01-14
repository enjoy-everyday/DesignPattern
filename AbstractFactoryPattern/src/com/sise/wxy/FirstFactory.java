package com.sise.wxy;

public class FirstFactory extends Factory {
	
	public FirstProduce TakeFirstProduce() {
		return new FirstProduce1();
	}
	
	public SecondProduce TakeSecondProduce() {
		return new SecondProduce1();
	}
	
}
