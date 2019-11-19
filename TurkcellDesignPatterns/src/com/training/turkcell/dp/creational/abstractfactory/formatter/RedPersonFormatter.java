package com.training.turkcell.dp.creational.abstractfactory.formatter;

public class RedPersonFormatter implements IPersonFormatter {

	@Override
	public IPersonNameFormatter getNameFormatter() {
		return new RedNameFormatter();
	}

	@Override
	public IPersonSurNameFormatter getSurNameFormatter() {
		return new RedSurnameNameFormatter();
	}

}
