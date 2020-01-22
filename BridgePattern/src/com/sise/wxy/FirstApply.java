package com.sise.wxy;

public class FirstApply extends Apply {

	public FirstApply(Realization realization) {
		super(realization);
	}

	@Override
	public void implement() {
		realization.realization();
	}

}
