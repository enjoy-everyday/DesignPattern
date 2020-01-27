package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		String names[] = {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};
		for(int i = 0; i < 6; i++) {
			FirstFlyweight firstFlyweight = (FirstFlyweight) FlyweightFactory.getFlyweight(names[i]);
			firstFlyweight.operation();
		}
		
	}

}
