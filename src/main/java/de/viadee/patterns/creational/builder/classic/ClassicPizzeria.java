package de.viadee.patterns.creational.builder.classic;

import de.viadee.patterns.creational.builder.Cheese;
import de.viadee.patterns.creational.builder.Dough;
import de.viadee.patterns.creational.builder.Pizza;
import de.viadee.patterns.creational.builder.Topping;

public class ClassicPizzeria {

	public static void main(String[] args) {
		Pizza pizza = ClassicPizzeria
				.makePizza()
				.withDough(wheat())
				.andCheese(mozzarella())
				.andFirstTopping(broccoli())
				.andSecondTopping(mushrooms());

		System.out.println(pizza.toJson());
		// {"dough":wheat,"toppings":[broccoli, mushrooms],"cheese":mozzarella}
	}

	public static PizzaBuilder makePizza() {
		return new PizzaBuilder();
	}

	private static Cheese mozzarella() {
		return new Cheese("mozzarella");
	}

	private static Topping broccoli() {
		return new Topping("broccoli");
	}

	private static Topping mushrooms() {
		return new Topping("mushrooms");
	}

	private static Dough wheat() {
		return new Dough("wheat");
	}

}
