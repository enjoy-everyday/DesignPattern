package com.sise.wxy;

public class FirstFactory implements Factory {

	@Override
	public Produce Take() {
		return new FirstProduce();
	}

}
