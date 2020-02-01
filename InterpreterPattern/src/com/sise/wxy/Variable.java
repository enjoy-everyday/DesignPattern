package com.sise.wxy;

public class Variable implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getValue(this);
	}

}
