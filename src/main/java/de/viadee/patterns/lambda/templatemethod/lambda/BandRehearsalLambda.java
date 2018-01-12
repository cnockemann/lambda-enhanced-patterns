package de.viadee.patterns.lambda.templatemethod.lambda;

import java.util.stream.Stream;

public class BandRehearsalLambda {

	public static void main(String[] args) {
		Musician guitarPlayer =
				new Musician(
						() -> System.out.println("connecting guitar to amp..."),
						() -> System.out.println("playing guitar..."));
		Musician singer =
				new Musician(
						() -> System.out.println("turning on mic..."),
						() -> System.out.println("singing..."));

		Stream.of(guitarPlayer, singer).forEach(Musician::performRehearsal);
		// driving to rehearsal...
		// connecting guitar to amp...
		// playing guitar...
		// complaining about bass player...
		// playing guitar...
		// driving home...
		//
		//
		// driving to rehearsal...
		// turning on mic...
		// singing...
		// complaining about bass player...
		// singing...
		// driving home...

	}

}
