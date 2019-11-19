package com.training.turkcell.dp.creational.abstractfactory.formatter;

public class BluePersonFormatter implements IPersonFormatter {

	@Override
	public IPersonNameFormatter getNameFormatter() {
		return new BlueNameFormatter();
	}

	@Override
	public IPersonSurNameFormatter getSurNameFormatter() {
		return new BlueSurnameNameFormatter();
	}

}
