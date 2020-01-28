package com.sise.wxy;

public class Proxy implements Subject {

	private RealSubject realSubject = new RealSubject();
	
	@Override
	public void request() {
		realSubject.request();
	}
	
}
