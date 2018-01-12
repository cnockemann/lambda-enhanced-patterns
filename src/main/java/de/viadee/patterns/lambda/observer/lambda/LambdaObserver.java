package de.viadee.patterns.lambda.observer.lambda;

import de.viadee.patterns.lambda.observer.Call;
import de.viadee.patterns.lambda.observer.Operator;

public class LambdaObserver {

	public static void main(String[] args) {

		Operator operator = new Operator();

		operator.registerAgent(call -> System.out.println("\"Try this new feature for only 10$ a month!\""));
		operator.registerAgent(call -> System.out.println("\"Have you tried turning it off and on again?\""));
		operator.registerAgent(call -> System.out.println("\"Please stay with us!\""));

		operator.distributeCall(new Call());
		// "Try this new feature for only 10$ a month!"
		// "Have you tried turning it off and on again?"
		// "Please stay with us!"

	}

}
