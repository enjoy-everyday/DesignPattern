package com.sise.wxy;

public class FirstBuilder extends Builder {
	
	private Menu menu = new Menu();
	
	public void BuildFood() {
		menu.setFood("����");
	}
	
	public void BuildDrink() {
		menu.setDrink("����");
	}
	
	public void Give() {
		System.out.println("*******�ײ�һ*******");
		System.out.println(menu.getFood());
		System.out.println(menu.getDrink());
	}
	
}
