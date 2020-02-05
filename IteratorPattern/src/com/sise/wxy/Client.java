package com.sise.wxy;

public class Client {
	
	public static void main(String[] args) {
		Aggregate firstAggregate = new FirstAggregate();
		for(Iterator iterator = firstAggregate.createIterator(); iterator.hasNext();) {
			String name = (String) iterator.currentItem();
			System.out.println(name);
		}
	}
	
}
