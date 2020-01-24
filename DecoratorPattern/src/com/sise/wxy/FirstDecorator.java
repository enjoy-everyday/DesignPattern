package com.sise.wxy;

public class FirstDecorator extends Decorator {

	public FirstDecorator(Original original) {
		super(original);
	}

	@Override
	public void origin() {
		System.out.println("******第一个装饰******");
		original.origin();
		firstMethod();
	}
	
	public void firstMethod() {
		System.out.println("第一个装饰器新增的方法");
	}
	
}
