package de.viadee.patterns.creational.builder;

public interface FirstToppingBuilder {
	SecondToppingBuilder andFirstTopping(Topping topping);
}