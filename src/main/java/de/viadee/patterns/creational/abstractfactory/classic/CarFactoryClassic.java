package de.viadee.patterns.creational.abstractfactory.classic;

import de.viadee.patterns.creational.abstractfactory.Car;

public interface CarFactoryClassic<T extends Car> {

	T assemble();

}
