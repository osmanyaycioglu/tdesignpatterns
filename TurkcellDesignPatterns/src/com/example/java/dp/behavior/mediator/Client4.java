package com.example.java.dp.behavior.mediator;

public class Client4 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 4 : " + string);
	}

}
