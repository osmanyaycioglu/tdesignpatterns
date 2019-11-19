package com.training.turkcell.dp.creational.abstractfactory.formatter;

public class ColorPersonFormatter implements IPersonFormatter {

	@Override
	public IPersonNameFormatter getNameFormatter() {
		return new ColorNameFormatter();
	}

	@Override
	public IPersonSurNameFormatter getSurNameFormatter() {
		return new ColorSurnameNameFormatter();
	}

}
