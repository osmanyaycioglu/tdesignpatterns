package com.training.turkcell.dp.structural.adaptor;

public class PrinterSystem2 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		System.out.println("Sayýn " + person.getName() + " " + person.getSurname());
	}

}
