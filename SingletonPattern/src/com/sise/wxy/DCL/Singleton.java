package com.sise.wxy.DCL;

public class Singleton {
	
	private volatile static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public void Message() {
		System.out.println("³É¹¦Êä³ö");
	}
	
}
