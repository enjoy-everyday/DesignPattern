package com.sise.wxy;

public class FirstBuilder extends Builder {
	
	private Menu menu = new Menu();
	
	public void BuildFood() {
		menu.setFood("ºº±¤");
	}
	
	public void BuildDrink() {
		menu.setDrink("¿ÉÀÖ");
	}
	
	public void Give() {
		System.out.println("*******Ì×²ÍÒ»*******");
		System.out.println(menu.getFood());
		System.out.println(menu.getDrink());
	}
	
}
