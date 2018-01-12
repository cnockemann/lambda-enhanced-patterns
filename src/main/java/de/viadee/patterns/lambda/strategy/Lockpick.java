package de.viadee.patterns.lambda.strategy;

public class Lockpick implements SafeCrackingStrategy {

	@Override
	public void crackSafe(Safe safe) {
		System.out.println("Trying to pick the lock...");
		if (safe.hasLock()) {
			safe.setOpen(true);
		}
	}

}
