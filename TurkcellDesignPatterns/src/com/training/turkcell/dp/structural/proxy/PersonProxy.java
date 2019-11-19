package com.training.turkcell.dp.structural.proxy;

public class PersonProxy extends Person {
	private Person pers;

	public PersonProxy(final Person person) {
		this.pers = person;
	}

	@Override
	public String getName() {
		return this.pers.getName();
	}

	@Override
	public void setName(final String name) {
		this.pers.setName(name);
	}

	@Override
	public String getSurname() {
		System.out.println("LOG - INFO - GetName Calling.");
		return this.pers.getSurname() + ".";
	}

	@Override
	public void setSurname(final String surname) {
		this.setSurname(surname);
	}

}
