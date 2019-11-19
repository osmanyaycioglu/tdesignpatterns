package com.training.turkcell.dp.creational.abstractfactory.formatter;

public interface IPersonFormatter {
	IPersonNameFormatter getNameFormatter();

	IPersonSurNameFormatter getSurNameFormatter();

}
