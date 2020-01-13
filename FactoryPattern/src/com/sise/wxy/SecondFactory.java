package com.sise.wxy;

public class SecondFactory implements Factory {

	@Override
	public Produce Take() {
		return new SecondProduce();
	}

}
