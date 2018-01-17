package de.viadee.patterns.creational.builder.classic;

import de.viadee.patterns.creational.builder.Cheese;
import de.viadee.patterns.creational.builder.CheeseBuilder;
import de.viadee.patterns.creational.builder.Dough;
import de.viadee.patterns.creational.builder.FirstToppingBuilder;
import de.viadee.patterns.creational.builder.Pizza;
import de.viadee.patterns.creational.builder.SecondToppingBuilder;
import de.viadee.patterns.creational.builder.Topping;

public class PizzaBuilder {

	Pizza pizza;

	public PizzaBuilder() {
		this.pizza = new Pizza();
	}

	public OnGoingPizzaBuilder withDough(Dough dough) {
		this.pizza.setDough(dough);
		return new OnGoingPizzaBuilder(pizza);
	}

	public class OnGoingPizzaBuilder implements CheeseBuilder, FirstToppingBuilder, SecondToppingBuilder {

		private Pizza pizza;

		public OnGoingPizzaBuilder(Pizza pizza) {
			this.pizza = pizza;
		}

		@Override
		public FirstToppingBuilder andCheese(Cheese cheese) {
			this.pizza.setCheese(cheese);
			return this;
		}

		@Override
		public Pizza andSecondTopping(Topping topping) {
			this.pizza.getToppings().add(topping);
			return pizza;
		}

		@Override
		public SecondToppingBuilder andFirstTopping(Topping topping) {
			this.pizza.getToppings().add(topping);
			return this;
		}
	}

}
