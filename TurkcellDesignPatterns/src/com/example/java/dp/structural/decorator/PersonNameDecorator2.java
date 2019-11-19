package com.example.java.dp.structural.decorator;

import com.example.java.dp.structural.adapter.Person;

public class PersonNameDecorator2 extends Person {

	private Person person;

	public PersonNameDecorator2(final Person person) {
		this.person = person;
	}

	@Override
	public String getName() {
		return this.person.getName() + " hazretleri";
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
