package com.training.turkcell.dp.creational.abstractfactory;

import com.training.turkcell.dp.creational.abstractfactory.formatter.IPersonFormatter;

public class PrinterSystem1 implements IPrinterSystem {

	@Override
	public void print(final Person person,
	                  final IPersonFormatter formatter) {
		System.out.println(formatter.getNameFormatter()
		                            .format(person)
		        + " " + formatter.getSurNameFormatter()
		                         .format(person));
	}

}
