package com.sise.wxy;

public class ThreeHandler extends Handler {
	
	@Override
	public void request(int request) {
		if(request == 1) {
			System.out.println("��������");
		}
		else {
			this.handler.request(request);
		}
	}

}
