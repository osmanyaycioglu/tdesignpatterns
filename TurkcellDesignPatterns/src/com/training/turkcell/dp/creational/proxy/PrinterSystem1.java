package com.training.turkcell.dp.creational.proxy;

public class PrinterSystem1 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		System.out.println(person.getName() + " " + person.getSurname());
	}

}
