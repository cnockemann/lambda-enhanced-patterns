package de.viadee.patterns.creational.builder;

import java.util.List;

public class Pizza {
	
	private Dough dough;
	
	private List<Topping> toppings;
	
	private Cheese cheese;

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	
	

}
