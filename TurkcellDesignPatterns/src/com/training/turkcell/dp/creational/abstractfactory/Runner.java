package com.training.turkcell.dp.creational.abstractfactory;

import com.training.turkcell.dp.creational.abstractfactory.formatter.FormatType;
import com.training.turkcell.dp.creational.abstractfactory.formatter.IPersonFormatter;
import com.training.turkcell.dp.creational.abstractfactory.formatter.PersonFormatterAbstractFactory;

public class Runner {
	public static void main(final String[] args) {
		Person person = new Person();
		person.setName("osman");
		person.setSurname("yaycioglu");
		int a = 2;

		IPrinterSystem printerSystem = PrinterSystemFactory.createPrinter(a);
		IPersonFormatter formatter = PersonFormatterAbstractFactory.createPersonFormatter(FormatType.KIRMIZI);
		printerSystem.print(person,
		                    formatter);
	}
}
