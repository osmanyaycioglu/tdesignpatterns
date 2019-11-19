package com.training.turkcell.dp.creational.abstractfactory.formatter;

import com.training.turkcell.dp.creational.abstractfactory.Person;

public class BlueNameFormatter implements IPersonNameFormatter {

	@Override
	public String format(final Person person) {
		return "M[" + person.getName() + "]";
	}

}
