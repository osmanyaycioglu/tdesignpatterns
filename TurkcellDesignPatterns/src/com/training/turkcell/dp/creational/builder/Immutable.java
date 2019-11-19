package com.training.turkcell.dp.creational.builder;

public class Immutable {

	private String name;
	private String surname;
	private String phone;
	private String fax;
	private int age;
	
	public Immutable(String name, String surname, String phone, String fax, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.fax = fax;
		this.age = age;
	}

	public Immutable(String name, String surname, String phone,  int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.age = age;
	}
	
	public Immutable(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPhone() {
		return phone;
	}
	public String getFax() {
		return fax;
	}
	public int getAge() {
		return age;
	}
}
