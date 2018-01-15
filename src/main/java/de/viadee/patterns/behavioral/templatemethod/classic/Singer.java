package de.viadee.patterns.behavioral.templatemethod.classic;

public class Singer extends Musician {

	@Override
	protected void rehearse() {
		System.out.println("singing...");
	}

	@Override
	protected void prepare() {
		System.out.println("turning on mic...");
	}

}
