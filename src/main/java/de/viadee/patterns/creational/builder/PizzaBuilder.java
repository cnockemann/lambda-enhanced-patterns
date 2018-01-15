package de.viadee.patterns.creational.builder;

public interface PizzaBuilder {
	
	DoughBuilder withDough(Dough dough);
	
	public interface DoughBuilder {
		ToppingBuilder andTopping(Topping topping);
	}
	
	public interface ToppingBuilder {
		ToppingBuilder andTopping(Topping topping);
		CheeseBuilder andCheese(Cheese cheese);
	}
	
	public interface CheeseBuilder {
		Pizza andCheese(Cheese cheese);
	}


}
