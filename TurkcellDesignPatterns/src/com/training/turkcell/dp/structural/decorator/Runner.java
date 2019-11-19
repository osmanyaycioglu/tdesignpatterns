package com.training.turkcell.dp.structural.decorator;

import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(final String[] args) {
		Pizza pizza = new Pizza();
		List<String> name = PizzaFactory.name();
		Scanner scanner = new Scanner(
		                              System.in);
		while (true) {
			int i = 0;
			for (i = 0; i < name.size(); i++) {
				System.out.println((i + 1) + "-" + name.get(i));
			}
			System.out.println((i + 1) + "-bitir");
			int nextInt = scanner.nextInt();
			if (nextInt == (i + 1)) {
				break;
			}
			pizza = PizzaFactory.getDecorators(pizza,
			                                   nextInt);
		}
		System.out.println(pizza.getDescription() + " = " + pizza.getPrice());
	}
}
