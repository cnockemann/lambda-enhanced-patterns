package de.viadee.patterns.creational.abstractfactory.classic;

import de.viadee.patterns.creational.abstractfactory.Fabia;

public class FabiaFactory implements CarFactoryClassic<Fabia> {

	@Override
	public Fabia assemble() {
		return new Fabia("Skoda", "Fabia", 54);
	}

}