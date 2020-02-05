package com.sise.wxy;

public class FirstAggregate implements Aggregate {

	@Override
	public Iterator createIterator() {
		return new FirstIterator(this);
	}
	
}
