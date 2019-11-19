package com.training.turkcell.dp.structural.adaptor;

public class PrinterSystem3 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		System.out.println("Say�nX " + person.getName() + " " + person.getSurname());
	}

}
