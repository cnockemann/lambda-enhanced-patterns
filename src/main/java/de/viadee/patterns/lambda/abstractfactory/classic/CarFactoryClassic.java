package de.viadee.patterns.lambda.abstractfactory.classic;

import de.viadee.patterns.lambda.abstractfactory.Car;

public interface CarFactoryClassic<T extends Car> {

	T assemble();

}
