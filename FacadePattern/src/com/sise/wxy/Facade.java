package com.sise.wxy;

public class Facade {
	
	private SubSystem firstSubSystem = new FirstSubSystem();
	private SubSystem secondSubSystem = new SecondSubSystem();
	private SubSystem threeSubSystem = new ThreeSubSystem();
	
	public void execute() {
		firstSubSystem.method();
		secondSubSystem.method();
		threeSubSystem.method();
	}
	
}
