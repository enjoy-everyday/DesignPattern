package com.sise.wxy;

public class Client {

	public static void main(String[] args) {
		Realization firstRealization = new FirstRealization();
		Apply firstApply = new FirstApply(firstRealization);

		Realization secondRealization = new SecondRealization();
		Apply secondApply = new FirstApply(secondRealization);
		
		firstApply.implement();
		secondApply.implement();
	}

}
