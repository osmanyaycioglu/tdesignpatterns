package com.example.java.dp.structural.proxy;

import com.example.java.dp.structural.adapter.BusCardPrinter;
import com.example.java.dp.structural.adapter.Person;

public class ProxyMain {
	public static void main(final String[] args) {
		Person person = new Person("osman", "yayc", 48);

		BusCardPrinter busCardPrinter = new BusCardPrinter();
		busCardPrinter.print(new PersonProxy(person));
	}
}
