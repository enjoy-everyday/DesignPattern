package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(5);
		Context context = new Context();
		context.addValue(a, 10);
		context.addValue(b, 150);
		Expression expression = new Multiply(new Add(a, b), new Division(new Subtract(b, a), c));
		System.out.println("½á¹û£º" + expression.interpret(context));
	}

}
