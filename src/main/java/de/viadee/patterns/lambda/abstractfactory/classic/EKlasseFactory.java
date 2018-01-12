package de.viadee.patterns.lambda.abstractfactory.classic;

import de.viadee.patterns.lambda.abstractfactory.EKlasse;

public class EKlasseFactory implements CarFactoryClassic<EKlasse> {

	@Override
	public EKlasse assemble() {
		return new EKlasse("Mercedes", "E-Klasse", 110);
	}

}