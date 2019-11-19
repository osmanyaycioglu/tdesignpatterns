package com.training.turkcell.dp.structural.decorator;

abstract public class AbstractPizza extends Pizza {
	private String description;
	private int price;
	private Pizza pizza;

	public AbstractPizza(final Pizza pizza, final String desc, final int price) {
		this.pizza = pizza;
		this.description = desc;
		this.price = price;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + "," + this.description;
	}

	@Override
	public int getPrice() {
		return this.pizza.getPrice() + this.price;
	}

}
