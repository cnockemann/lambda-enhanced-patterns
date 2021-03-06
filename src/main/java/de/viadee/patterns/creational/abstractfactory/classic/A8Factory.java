package de.viadee.patterns.creational.abstractfactory.classic;

import de.viadee.patterns.creational.abstractfactory.A8;

public class A8Factory implements CarFactoryClassic<A8> {

	@Override
	public A8 assemble() {
		return new A8("Audi", "A8", 190);
	}

}