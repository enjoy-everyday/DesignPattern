package com.sise.wxy.register;

public class Singleton {
	
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	private Singleton (){}
	
	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public void Message() {
		System.out.println("³É¹¦Êä³ö");
	}
	
}
