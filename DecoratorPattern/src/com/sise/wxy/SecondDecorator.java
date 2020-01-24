package com.sise.wxy;

public class SecondDecorator extends Decorator {
	
	private String name;

	public SecondDecorator(Original original) {
		super(original);
	}

	@Override
	public void origin() {
		System.out.println("******第二个装饰器******");
		original.origin();
		setName("Second");
		System.out.println("name：" + name);
		secondMethod();
	}
	
	public void secondMethod() {
		System.out.println("第二个装饰器新增的方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
