package com.sise.wxy.objectAdapter;

public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.request("������һ");
		target.request("��������");
		target.request("��������");
	}

}
