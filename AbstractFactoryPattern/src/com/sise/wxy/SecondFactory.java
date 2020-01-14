package com.sise.wxy;

public class SecondFactory extends Factory {
	
	public FirstProduce TakeFirstProduce() {
		return new FirstProduce2();
	}
	
	public SecondProduce TakeSecondProduce() {
		return new SecondProduce2();
	}
	
}
