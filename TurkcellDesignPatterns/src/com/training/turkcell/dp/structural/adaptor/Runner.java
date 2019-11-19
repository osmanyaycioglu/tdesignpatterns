package com.training.turkcell.dp.structural.adaptor;

public class Runner {
	public static void main(final String[] args) {
		Person person = new Person();
		person.setName("osman");
		person.setSurname("yaycioglu");
		int a = 2;

		IPrinterSystem printerSystem = PrinterSystemFactory.createPrinter(a);
		printerSystem.print(person);

		Customer customer = new Customer();
		customer.setIsim("veli");
		customer.setSoyisim("ali");
		printerSystem.print(customer);

	}
}
