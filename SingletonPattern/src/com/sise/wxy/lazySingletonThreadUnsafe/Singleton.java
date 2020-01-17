package com.sise.wxy.lazySingletonThreadUnsafe;

public class Singleton {
	
	private static Singleton sigleton = null;
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		if (sigleton == null) {
			sigleton = new Singleton();
		}
		return sigleton;
	}
	
	public void Message() {
		System.out.println("³É¹¦Êä³ö");
	}
	
}
