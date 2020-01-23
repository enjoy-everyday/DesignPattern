package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Component firstLeaf = new FirstLeaf();
		Component secondLeaf = new SecondLeaf();
		Component threeLeaf = new ThreeLeaf();
		Component composite = new Composite();
		composite.add(firstLeaf);
		composite.add(secondLeaf);
		composite.add(threeLeaf);
		composite.remove(secondLeaf);
		composite.operation();
	}

}
