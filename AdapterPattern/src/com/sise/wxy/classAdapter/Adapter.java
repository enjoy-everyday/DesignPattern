package com.sise.wxy.classAdapter;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request(String target) {
		if(target.equals("������һ")) {
			System.out.print(target);
			super.FirstMethod();
		}
		else if(target.equals("��������")) {
			System.out.print(target);
			super.SecondMethod();
		}
		else {
			System.out.println("null");
		}
	}
	
}
