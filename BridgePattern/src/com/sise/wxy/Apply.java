package com.sise.wxy;

public abstract class Apply {
	
	protected Realization realization;
	
	public Apply(Realization realization) {
		this.realization = realization;
	}
	
	public abstract void implement();
	
}
