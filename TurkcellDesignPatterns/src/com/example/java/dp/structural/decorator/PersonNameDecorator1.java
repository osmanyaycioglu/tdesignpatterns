package com.example.java.dp.structural.decorator;

import com.example.java.dp.structural.adapter.Person;

public class PersonNameDecorator1 extends Person {

	private Person person;

	public PersonNameDecorator1(final Person person) {
		this.person = person;
	}

	@Override
	public String getName() {
		return "Say�n " + this.person.getName();
	}

	@Override
	public String getSurname() {
		return this.person.getSurname();
	}

	@Override
	public int getAge() {
		return this.person.getAge();
	}

}
