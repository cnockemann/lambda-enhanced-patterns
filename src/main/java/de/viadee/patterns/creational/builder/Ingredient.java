package de.viadee.patterns.creational.builder;

public class Ingredient {

	private String name;

	public Ingredient(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}


}
