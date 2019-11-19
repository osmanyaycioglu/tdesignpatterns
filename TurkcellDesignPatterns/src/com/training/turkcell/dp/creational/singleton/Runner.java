package com.training.turkcell.dp.creational.singleton;

public class Runner {
	public static void main(final String[] args) {
		Singleton instance2 = Singleton.getInstance();

		SingletonLazy instance = SingletonLazy.getInstance();

		SingletonNew.INSTANCE.helloWorld();

	}
}
