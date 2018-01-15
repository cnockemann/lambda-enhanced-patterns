package de.viadee.patterns.creational.abstractfactory.classic;

import de.viadee.patterns.creational.abstractfactory.EKlasse;

public class EKlasseFactory implements CarFactoryClassic<EKlasse> {

	@Override
	public EKlasse assemble() {
		return new EKlasse("Mercedes", "E-Klasse", 110);
	}

}