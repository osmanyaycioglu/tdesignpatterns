package com.example.java.dp.creational.singleton;

public enum ESingleton {
	INSTANCE1 {
		@Override
		public String speak() {
			System.out.println("test");
			return "bla bla 1";
		}
	},
	INSTANCE2, INSTANCE3;

	public String speak() {
		System.out.println("Konu�uyorum");
		return "bla bla";
	}

}
