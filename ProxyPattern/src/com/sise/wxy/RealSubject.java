package com.sise.wxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("被代理执行的方法");
	}
	
}
