package de.viadee.patterns.creational.builder;

public class PizzaBuilder implements DoughBuilder {
	
	Pizza pizza;

	private PizzaBuilder() {
		this.pizza = new Pizza();
	}

	public static PizzaBuilder start() {
		return new PizzaBuilder();
	}

	@Override
	public ToppingBuilder withDough(Dough topping) {
		return new OnGoingPizzaBuilder(pizza);
	}
	
	public class OnGoingPizzaBuilder implements ToppingBuilder, CheeseBuilder {

		private Pizza pizza;

		public OnGoingPizzaBuilder(Pizza pizza) {
			this.pizza = pizza;
		}

		@Override
		public ToppingBuilder andTopping(Topping topping) {
			this.pizza.getToppings().add(topping);
			return this;
		}

		@Override
		public CheeseBuilder andCheese(Cheese cheese) {
			this.pizza.setCheese(cheese);
			return null;
		}

		@Override
		public Pizza done() {
			return pizza;
		}

	}

}
