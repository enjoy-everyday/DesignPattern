package com.sise.wxy.lazySingletonThreadSafety;

public class Singleton {
	
	private static Singleton sigleton = null;
	
	private Singleton() {}
	
	public static synchronized Singleton getSingleton() {
		if (sigleton == null) {
			sigleton = new Singleton();
		}
		return sigleton;
	}
	
	public void Message() {
		System.out.println("³É¹¦Êä³ö");
	}
	
}
