package de.viadee.patterns.behavioral.templatemethod.classic;

public abstract class Musician {

	public void performRehearsal() {
		arrive();
		prepare();
		rehearse();
		complain();
		rehearse();
		depart();
	}

	private void complain() {
		System.out.println("complaining about bass player...");
	}

	private void depart() {
		System.out.println("driving home...");
		System.out.println("\n");
	}

	protected abstract void rehearse();

	protected abstract void prepare();

	private void arrive() {
		System.out.println("driving to rehearsal...");
	}

}
