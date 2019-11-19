package com.training.turkcell.dp.behavioral.state;

public class StateUpper implements IState {

	@Override
	public IState change(final String str) {
		System.out.println(str.toUpperCase());
		return new StateLower();
	}

}
