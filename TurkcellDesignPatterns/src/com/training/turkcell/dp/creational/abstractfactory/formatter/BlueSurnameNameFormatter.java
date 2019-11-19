package com.training.turkcell.dp.creational.abstractfactory.formatter;

import com.training.turkcell.dp.creational.abstractfactory.Person;

public class BlueSurnameNameFormatter implements IPersonSurNameFormatter {

	@Override
	public String format(final Person person) {
		return "M[" + person.getSurname() + "]";
	}

}
