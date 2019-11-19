package com.training.turkcell.dp.structural.decorator;

import java.util.Arrays;
import java.util.List;

public class PizzaFactory {
	public static Pizza getDecorators(final Pizza pizza,
	                                  final int index) {
		switch (index) {
		case 1:
			return new PizzaPeynir(
			                       pizza);
		case 2:
			return new PizzaMantar(
			                       pizza);
		case 3:
			return new PizzaMisir(
			                      pizza);
		case 4:
			return new PizzaDomates(
			                        pizza);
		default:
			return pizza;
		}
	}

	public static List<String> name() {
		return Arrays.asList("Peynir",
		                     "Mantar",
		                     "Misir",
		                     "Domates");
	}
}
