package com.sise.wxy;

public class SecondHandler extends Handler {

	@Override
	public void request(int request) {
		if(request == 2) {
			System.out.println("��������");
		}
		else {
			this.handler.request(request);
		}
	}

}
