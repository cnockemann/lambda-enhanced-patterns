package de.viadee.patterns.behavioral.strategy;

public class Dynamite implements SafeCrackingStrategy {

	@Override
	public void crackSafe(Safe safe) {
		System.out.println("\nBOOM!");
		if (safe.getSturdiness() <= 9000) {
			safe.setOpen(true);
		}

	}

}
