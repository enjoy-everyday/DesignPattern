package com.sise.wxy.objectAdapter;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request(String target) {
		if(target.equals("ÊÊÅäÆ÷Ò»")) {
			System.out.print(target);
			adaptee.FirstMethod();
		}
		else if(target.equals("ÊÊÅäÆ÷¶ş")) {
			System.out.print(target);
			adaptee.SecondMethod();
		}
		else {
			System.out.println("null");
		}
	}
	
}
