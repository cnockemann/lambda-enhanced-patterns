package de.viadee.patterns.lambda.strategy;

public class SafeHeist {

	private SafeCrackingStrategy strategy;

	public void chooseStrategy(SafeCrackingStrategy strategy) {
		this.strategy = strategy;
	}

	public void performHeist(Safe safe) {
		strategy.crackSafe(safe);
		System.out.println("Safe is open = " + safe.isOpen());
	}

	public static void main(String[] args) {
		SafeHeist heist = new SafeHeist();
		Safe safeToBeCracked = new Safe();

		heist.chooseStrategy(new Lockpick());
		heist.performHeist(safeToBeCracked);

		heist.chooseStrategy(new Dynamite());
		heist.performHeist(safeToBeCracked);

		System.out.println("\nLet's make this easy!");
		heist.chooseStrategy(safe -> safe.setOpen(true));
		heist.performHeist(safeToBeCracked);

		// Trying to pick the lock...
		// Safe is open = false
		//
		// BOOM!
		// Safe is open = false
		//
		// Let's make this easy!
		// Safe is open = true
	}

}
