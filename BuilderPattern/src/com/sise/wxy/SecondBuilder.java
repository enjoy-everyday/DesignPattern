package com.sise.wxy;

public class SecondBuilder extends Builder {
	
	private Menu menu = new Menu();
	
	public void BuildFood() {
		menu.setFood("ÊíÌõ");
	}
	
	public void BuildDrink() {
		menu.setDrink("ÄÌ²è");
	}
	
	public void Give() {
		System.out.println("*******Ì×²Í¶ş*******");
		System.out.println(menu.getFood());
		System.out.println(menu.getDrink());
	}
	
}
