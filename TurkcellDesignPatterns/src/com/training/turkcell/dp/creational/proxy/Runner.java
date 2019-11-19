package com.training.turkcell.dp.creational.proxy;

public class Runner {
	public static void main(final String[] args) {
		Person person = new Person();
		person.setName("osman");
		person.setSurname("yaycioglu");
		int a = 2;

		IPrinterSystem printerSystem = PrinterSystemFactory.createPrinter(a);
		printerSystem.print(new PersonProxy(
		                                    person));
	}
}
