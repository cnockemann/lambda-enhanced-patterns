package de.viadee.patterns.creational.builder.lambda;

import de.viadee.patterns.creational.builder.Cheese;
import de.viadee.patterns.creational.builder.CheeseBuilder;
import de.viadee.patterns.creational.builder.Dough;
import de.viadee.patterns.creational.builder.Pizza;
import de.viadee.patterns.creational.builder.Topping;

public class LambdaPizzeria {

	public static void main(String[] args) {

		Pizza pizza = LambdaPizzeria
				.makePizza()
				.withDough(wheat())
				.andCheese(mozzarella())
				.andFirstTopping(broccoli())
				.andSecondTopping(mushrooms());

		System.out.println(pizza.toJson());
		// {"dough":wheat,"toppings":[broccoli, mushrooms],"cheese":mozzarella}

	}

	public static PizzaBuilderLambda makePizza() {
		return dough -> cheese -> topping1 -> topping2 -> new Pizza(dough, cheese, topping1, topping2);
	}

	public interface PizzaBuilderLambda {
		CheeseBuilder withDough(Dough dough);
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
