package com.sise.wxy;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map values = new HashMap();
	
	public void addValue(Variable x, int y) {
		values.put(x, y);
	}
	
	public int getValue(Variable variable) {
		int i = (int) values.get(variable);
		return i;
	}
	
}
