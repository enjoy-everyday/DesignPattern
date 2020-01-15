package com.sise.wxy;

public class SecondBuilder extends Builder {
	
	private Menu menu = new Menu();
	
	public void BuildFood() {
		menu.setFood("����");
	}
	
	public void BuildDrink() {
		menu.setDrink("�̲�");
	}
	
	public void Give() {
		System.out.println("*******�ײͶ�*******");
		System.out.println(menu.getFood());
		System.out.println(menu.getDrink());
	}
	
}
