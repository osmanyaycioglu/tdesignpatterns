package com.training.turkcell.dp.creational.builder;

public class ImMain {
	public static void main(final String[] args) {
		Immutable immutable = new Immutable(
		                                    "yaycioglu",
		                                        "osman",
		                                        "74366734",
		                                        "87e7wq",
		                                        49);
		Immutable immutable2 = new Immutable(
		                                     "osman",
		                                         "yaycioglu",
		                                         "74366734",
		                                         49);
		BuilderPattern build = BuilderPattern.getBuilder()
		                                     .setName("osman")
		                                     .setSurname("yay")
		                                     .setPhone("872732")
		                                     .setFax("8738273")
		                                     .setAge(49)
		                                     .build();
		BuilderPattern build2 = BuilderPattern.getBuilder()
		                                      .setName("osman")
		                                      .setSurname("yay")
		                                      .setPhone("872732")
		                                      .setAge(49)
		                                      .buildForDatabase();
	}
}
