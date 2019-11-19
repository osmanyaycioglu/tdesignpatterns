package com.example.java.dp.creational.factory;

import com.example.java.dp.creational.oo.Animal;
import com.example.java.dp.creational.oo.Cat;
import com.example.java.dp.creational.oo.Dog;
import com.example.java.dp.creational.oo.Lion;

public class AnimalFactory {
	public static Animal createAnimal(final int index) {
		Animal animal = null;
		switch (index) {
		case 1:
			animal = new Dog();
			break;
		case 2:
			animal = new Cat();
			break;
		case 3:
			animal = new Lion();
			break;

		default:
			animal = new Dog();
			break;
		}
		return animal;
	}
}
