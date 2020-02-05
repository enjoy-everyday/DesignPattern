package com.sise.wxy;

public class FirstIterator implements Iterator {
	
	private FirstAggregate firstAggregate;
	private String names[] = {"aaa", "bbb", "ccc", "ddd"};
	private int cursor;
	
	public FirstIterator(FirstAggregate firstAggregate) {
		this.firstAggregate = firstAggregate;
	}

	@Override
	public boolean hasNext() {
		if(cursor < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		if(this.hasNext()) {
			return names[cursor++];
		}
		return null;
	}

}
