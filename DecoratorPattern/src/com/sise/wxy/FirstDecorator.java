package com.sise.wxy;

public class FirstDecorator extends Decorator {

	public FirstDecorator(Original original) {
		super(original);
	}

	@Override
	public void origin() {
		System.out.println("******��һ��װ��******");
		original.origin();
		firstMethod();
	}
	
	public void firstMethod() {
		System.out.println("��һ��װ���������ķ���");
	}
	
}
