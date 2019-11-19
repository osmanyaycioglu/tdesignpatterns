package com.training.turkcell.dp.behavioral.state;

public class StateLower implements IState {

	@Override
	public IState change(final String str) {
		System.out.println(str.toLowerCase());
		return new StateUpper();
	}

}
