package com.training.turkcell.dp.creational.singleton;

public class SingletonLazy {
	private static volatile SingletonLazy instance;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (SingletonLazy.instance == null) {
			synchronized (SingletonLazy.class) {
				if (SingletonLazy.instance == null) {
					SingletonLazy.instance = new SingletonLazy();
				}
			}
		}
		return SingletonLazy.instance;
	}

}
