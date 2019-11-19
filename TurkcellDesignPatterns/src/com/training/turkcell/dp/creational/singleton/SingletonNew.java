package com.training.turkcell.dp.creational.singleton;

public enum SingletonNew implements IExecute {
	INSTANCE;

	public String helloWorld() {
		return "hello";
	}

	@Override
	public String execute() {
		return null;
	}

	// STATE1, STATE2 {
//		@Override
//		public String helloWorld() {
//			return "hello from state2";
//		}
//
//	},
//	STATE3;
//
//	public String helloWorld() {
//		return "hello";
//	}

}
