package com.sise.wxy;

import com.sise.wxy.eagerSingleton.Singleton;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		singleton.Message();
	}

}
