package com.training.turkcell.dp.creational.abstractfactory;

import com.training.turkcell.dp.creational.abstractfactory.formatter.IPersonFormatter;

public interface IPrinterSystem {
	public void print(Person person,
	                  IPersonFormatter formatter);
}
