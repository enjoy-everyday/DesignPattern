package com.sise.wxy;

public class FirstFlyweight implements Flyweight {
	
	private String name;

	public FirstFlyweight(String name) {
		this.name =  name;
	}
	
	@Override
	public void operation() {
		System.out.println("name£º" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
