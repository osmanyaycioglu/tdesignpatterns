package com.training.turkcell.dp.creational.abstractfactory;

import com.training.turkcell.dp.creational.abstractfactory.formatter.IPersonFormatter;

public class PrinterSystem3 implements IPrinterSystem {

	@Override
	public void print(final Person person,
	                  final IPersonFormatter formatter) {
		System.out.println("Say�nX " + person.getName() + " " + person.getSurname());
	}

}
