package com.sise.wxy.eagerSingleton;

public class Singleton {
	
	private static Singleton sigleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		return sigleton;
	}
	
	public void Message() {
		System.out.println("³É¹¦Êä³ö");
	}
	
}
