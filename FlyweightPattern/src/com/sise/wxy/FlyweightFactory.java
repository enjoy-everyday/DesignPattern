package com.sise.wxy;

import java.util.HashMap;

public class FlyweightFactory {
	
	private static HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	public static 	Flyweight getFlyweight(String name) {
		if(flyweights.containsKey(name)) {
			return flyweights.get(name);
		}
		else {
			Flyweight flyweight = new FirstFlyweight(name);
			flyweights.put(name, flyweight);
			return flyweight;
		}
	}
	
}
