package com.training.turkcell.dp.structural.adaptor;

import com.training.turkcell.dp.structural.facade.JsonFacade;

public class PrinterSystem4 implements IPrinterSystem {

	@Override
	public void print(final Person person) {
		JsonFacade facade = new JsonFacade();
		System.out.println(facade.convertToJson(person));
	}

}
