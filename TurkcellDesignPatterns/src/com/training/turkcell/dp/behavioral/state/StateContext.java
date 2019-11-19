package com.training.turkcell.dp.behavioral.state;

public class StateContext implements IState {
	private IState currentState = new StateUpper();

	@Override
	public IState change(final String str) {
		this.currentState = this.currentState.change(str);
		return this.currentState;
	}

}
