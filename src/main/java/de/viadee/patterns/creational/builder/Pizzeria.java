package de.viadee.patterns.creational.builder;

public class Pizzeria {

	public static void main(String[] args) {
		Pizza pizza = PizzaBuilder.start()
				.withDough(wheat())
				.andTopping(mushrooms())
				.andTopping(broccoli())
				.andCheese(mozzarella())
				.done();
	}

	private static Cheese mozzarella() {
		return null;
	}

	private static Topping broccoli() {
		return null;
	}

	private static Topping mushrooms() {
		return null;
	}

	private static Dough wheat() {
		return new Dough() {
		};
	}

}
