package com.sise.wxy;

public class Division implements Expression {

	private Expression x, y;
	
	public Division(Expression x, Expression y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int interpret(Context context) {
		return x.interpret(context) / y.interpret(context);
	}
	
}
