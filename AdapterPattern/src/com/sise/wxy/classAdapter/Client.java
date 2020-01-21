package com.sise.wxy.classAdapter;

public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request("ÊÊÅäÆ÷Ò»");
		target.request("ÊÊÅäÆ÷¶ş");
		target.request("ÊÊÅäÆ÷Èı");
	}

}
