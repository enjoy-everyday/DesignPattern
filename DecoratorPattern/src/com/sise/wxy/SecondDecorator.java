package com.sise.wxy;

public class SecondDecorator extends Decorator {
	
	private String name;

	public SecondDecorator(Original original) {
		super(original);
	}

	@Override
	public void origin() {
		System.out.println("******�ڶ���װ����******");
		original.origin();
		setName("Second");
		System.out.println("name��" + name);
		secondMethod();
	}
	
	public void secondMethod() {
		System.out.println("�ڶ���װ���������ķ���");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
