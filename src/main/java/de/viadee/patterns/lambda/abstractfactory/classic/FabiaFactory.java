package de.viadee.patterns.lambda.abstractfactory.classic;

import de.viadee.patterns.lambda.abstractfactory.Fabia;

public class FabiaFactory implements CarFactoryClassic<Fabia> {

	@Override
	public Fabia assemble() {
		return new Fabia("Skoda", "Fabia", 54);
	}

}