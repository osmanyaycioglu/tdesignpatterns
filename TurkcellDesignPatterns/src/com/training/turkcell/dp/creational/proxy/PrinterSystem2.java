package com.training.turkcell.dp.creational.proxy;

public class PrinterSystem2 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		System.out.println("Say�n " + person.getName() + " " + person.getSurname());
	}

}
