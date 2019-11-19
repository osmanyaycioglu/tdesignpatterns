package com.training.turkcell.dp.creational.adaptor;

import com.training.turkcell.dp.creational.facade.JsonFacade;

public class PrinterSystem4 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		JsonFacade facade = new JsonFacade();
		System.out.println(facade.convertToJson(person));
	}

}
