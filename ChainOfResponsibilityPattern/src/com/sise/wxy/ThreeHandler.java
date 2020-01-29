package com.sise.wxy;

public class ThreeHandler extends Handler {
	
	@Override
	public void request(int request) {
		if(request == 1) {
			System.out.println("三级别处理");
		}
		else {
			this.handler.request(request);
		}
	}

}
