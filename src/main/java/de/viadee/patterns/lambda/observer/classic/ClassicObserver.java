package de.viadee.patterns.lambda.observer.classic;

import de.viadee.patterns.lambda.observer.Call;
import de.viadee.patterns.lambda.observer.Operator;

public class ClassicObserver {

	public static void main(String[] args) {
		Operator operator = new Operator();

		operator.registerAgent(new Upselling());
		operator.registerAgent(new CustomerSupport());
		operator.registerAgent(new CustomerRetention());

		operator.distributeCall(new Call());
		// "Try this new feature for only 10$ a month!"
		// "Have you tried turning it off and on again?"
		// "Please stay with us!"
	}

}
