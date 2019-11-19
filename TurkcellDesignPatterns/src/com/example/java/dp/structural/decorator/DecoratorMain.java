package com.example.java.dp.structural.decorator;

import com.example.java.dp.structural.adapter.BusCardPrinter;
import com.example.java.dp.structural.adapter.Person;

public class DecoratorMain {
	public static void main(final String[] args) {
		Person person = new PersonNameDecorator1(new PersonNameDecorator2(new Person("osman", "yay", 58)));
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		busCardPrinter.print(person);
	}
}
