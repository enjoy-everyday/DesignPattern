package com.sise.wxy;

public abstract class Decorator extends Original {
	
	protected Original original;
	
	public Decorator(Original original) {
		this.original = original;
	}
	
}
