package de.viadee.patterns.lambda.templatemethod.lambda;

public class Musician {
	
	Runnable preparation;
	
	Runnable rehearsal;

	public Musician(Runnable preparation, Runnable rehearsal) {
		this.preparation = preparation;
		this.rehearsal = rehearsal;
	}

	public void performRehearsal() {
		arrive();
		preparation.run();
		rehearsal.run();
		complain();
		rehearsal.run();
		depart();
	}

	private void complain() {
		System.out.println("complaining about bass player...");
	}

	private void depart() {
		System.out.println("driving home...");
		System.out.println("\n");
	}


	private void arrive() {
		System.out.println("driving to rehearsal...");
	}

}
