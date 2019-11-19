package com.training.turkcell.dp.creational.abstractfactory;

import com.training.turkcell.dp.creational.abstractfactory.formatter.IPersonFormatter;

public class PrinterSystem2 implements IPrinterSystem {

	@Override
	public void print(final Person person,
	                  final IPersonFormatter formatter) {
		System.out.println("Sayýn " + person.getName() + " " + person.getSurname());
	}

}