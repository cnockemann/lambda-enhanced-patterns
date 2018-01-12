package de.viadee.patterns.lambda.templatemethod.classic;

public class GuitarPlayer extends Musician {

	@Override
	protected void rehearse() {
		System.out.println("playing guitar...");
	}

	@Override
	protected void prepare() {
		System.out.println("connecting guitar to amp...");
	}

}
