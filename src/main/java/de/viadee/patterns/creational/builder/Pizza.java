package de.viadee.patterns.creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Pizza {
	
	private Dough dough;
	
	private List<Topping> toppings = new ArrayList<>();
	
	private Cheese cheese;

	public Pizza() {
	}

	public Pizza(Dough dough, Cheese cheese, Topping... toppings) {
		super();
		this.dough = dough;
		this.toppings = Arrays.asList(toppings);
		this.cheese = cheese;
	}

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
	
	public String toJson() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
	

}
