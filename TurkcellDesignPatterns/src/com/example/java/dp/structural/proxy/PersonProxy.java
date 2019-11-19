package com.example.java.dp.structural.proxy;

import com.example.java.dp.structural.adapter.Person;

public class PersonProxy extends Person {

	private Person person;

	public PersonProxy(final Person person) {
		this.person = person;
	}

	@Override
	public String getName() {
		System.out.println("getName �a�r�ld�");
		return this.person.getName();
	}

	@Override
	public String getSurname() {
		System.out.println("getSurname �a�r�ld�");
		return this.person.getSurname();
	}

	@Override
	public int getAge() {
		System.out.println("getAge �a�r�ld�");
		return this.person.getAge();
	}

}
