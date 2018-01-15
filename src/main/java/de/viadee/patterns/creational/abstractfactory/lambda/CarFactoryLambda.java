package de.viadee.patterns.creational.abstractfactory.lambda;

import java.util.function.Supplier;

import de.viadee.patterns.creational.abstractfactory.Car;

@FunctionalInterface
public interface CarFactoryLambda<T extends Car> extends Supplier<T> {

	T assemble();

	@Override
	default T get() {
		return assemble();
	}
}
