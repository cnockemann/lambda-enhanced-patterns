package de.viadee.patterns.creational.abstractfactory.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import de.viadee.patterns.creational.abstractfactory.A8;
import de.viadee.patterns.creational.abstractfactory.Car;
import de.viadee.patterns.creational.abstractfactory.EKlasse;
import de.viadee.patterns.creational.abstractfactory.Fabia;
import de.viadee.patterns.creational.abstractfactory.Model;

public class LambdaClient {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LambdaClient lambdaFactory = new LambdaClient();
		Car fabia = lambdaFactory.getCarFactoryByModel(Model.FABIA).assemble();
		Car a8 = lambdaFactory.getCarFactoryByModel(Model.A8).assemble();
		Car eKlasse = lambdaFactory.getCarFactoryByModel(Model.EKLASSE).assemble();
		// Assembling Fabia...
		// Assembling A8...
		// Assembling E-Klasse...

		System.out.println("\nAssemble 3 Fabias in a row:");
		Stream.generate(lambdaFactory.getCarFactoryByModel(Model.FABIA))
				.limit(3)
				.map(Car::toJson)
				.forEach(System.out::println);
		// Assemble 3 Fabias in a row:
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":52}
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":52}
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":52}

	}

	private Map<Model, CarFactoryLambda<? extends Car>> carFactoryRegistry = new HashMap<>();

	public LambdaClient() {
		carFactoryRegistry.put(Model.FABIA, () -> new Fabia("Skoda", "Fabia", 52));
		carFactoryRegistry.put(Model.A8, () -> new A8("Audi", "A8", 190));
		carFactoryRegistry.put(Model.EKLASSE, () -> new EKlasse("Mercedes", "E-Klasse", 110));

	}


	public CarFactoryLambda<? extends Car> getCarFactoryByModel(Model model) {
		return carFactoryRegistry.get(model);
	}

}
