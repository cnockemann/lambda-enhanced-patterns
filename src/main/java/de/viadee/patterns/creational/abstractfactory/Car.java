package de.viadee.patterns.creational.abstractfactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class Car {
	public String brand;

	public String model;

	public int ps;

	public Car(String brand, String model, int ps) {
		System.out.println("Assembling " + model + "...");
		this.brand = brand;
		this.model = model;
		this.ps = ps;
	}

	public String toJson() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	// Getters/setters...


}