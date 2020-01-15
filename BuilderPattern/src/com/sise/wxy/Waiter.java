package com.sise.wxy;

public class Waiter {
	
	private Builder builder;

	public void Ask() {
		builder.BuildFood();
		builder.BuildDrink();
	}
	
	public void Take() {
		builder.Give();
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	
}
