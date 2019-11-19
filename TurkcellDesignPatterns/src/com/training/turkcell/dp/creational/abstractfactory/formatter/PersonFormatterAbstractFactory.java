package com.training.turkcell.dp.creational.abstractfactory.formatter;

public class PersonFormatterAbstractFactory {
	public static IPersonFormatter createPersonFormatter(final FormatType formatType) {
		switch (formatType) {
		case KIRMIZI:
			return new RedPersonFormatter();
		case MAVI:
			return new BluePersonFormatter();
		case RENKLI:
			return new ColorPersonFormatter();

		default:
			return new RedPersonFormatter();
		}
	}
}
