package de.viadee.patterns.creational.builder;

public interface ToppingBuilder {
	ToppingBuilder andTopping(Topping topping);

	CheeseBuilder andCheese(Cheese cheese);

	Pizza done();
}