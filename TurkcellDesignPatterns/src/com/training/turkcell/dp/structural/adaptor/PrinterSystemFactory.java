package com.training.turkcell.dp.structural.adaptor;

public class PrinterSystemFactory {
	public static IPrinterSystem createPrinter(final int a) {
		IPrinterSystem printerSystem = null;

		switch (a) {
		case 1:
			printerSystem = new PrinterSystem1();
			break;
		case 2:
			printerSystem = new PrinterSystem2();
			break;
		case 3:
			printerSystem = new PrinterSystem3();
			break;

		default:
			printerSystem = new PrinterSystem1();
			break;
		}
		return printerSystem;
	}
}
