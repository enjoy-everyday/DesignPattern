package com.sise.wxy.objectAdapter;

public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.request("ÊÊÅäÆ÷Ò»");
		target.request("ÊÊÅäÆ÷¶ş");
		target.request("ÊÊÅäÆ÷Èı");
	}

}
