package de.viadee.patterns.creational.abstractfactory.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import de.viadee.patterns.creational.abstractfactory.A8;
import de.viadee.patterns.creational.abstractfactory.Car;
import de.viadee.patterns.creational.abstractfactory.EKlasse;
import de.viadee.patterns.creational.abstractfactory.Fabia;
import de.viadee.patterns.creational.abstractfactory.Model;

public class AbstractFactoryLambda {

	public static void main(String[] args) {
		AbstractFactoryLambda abstractLambdaFactory = new AbstractFactoryLambda();
		Car fabia = abstractLambdaFactory.getCarFactoryByModel(Model.FABIA).assemble();
		System.out.println(fabia.toJson());
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":52}

		Car a8 = abstractLambdaFactory.getCarFactoryByModel(Model.A8).assemble();
		System.out.println(a8.toJson());
		// Assembling A8...
		// {"brand":"Audi","model":"A8","ps":190}

		Car eKlasse = abstractLambdaFactory.getCarFactoryByModel(Model.EKLASSE).assemble();
		System.out.println(eKlasse.toJson());
		// Assembling E-Klasse...
		// {"brand":"Mercedes","model":"E-Klasse","ps":110}

		System.out.println("\nAssemble 3 Fabias in a row:");
		Stream.generate(abstractLambdaFactory.getCarFactoryByModel(Model.FABIA))
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

		Car absent = null;
		Car present = Optional.ofNullable(absent)
				.orElseGet(abstractLambdaFactory.getCarFactoryByModel(Model.A8));
		System.out.println(present.toJson());
		// Assembling A8...
		// {"brand":"Audi","model":"A8","ps":190}

	}

	private Map<Model, CarFactoryLambda<? extends Car>> carFactoryRegistry = new HashMap<>();

	public AbstractFactoryLambda() {
		carFactoryRegistry.put(Model.FABIA, () -> new Fabia("Skoda", "Fabia", 52));
		carFactoryRegistry.put(Model.A8, () -> new A8("Audi", "A8", 190));
		carFactoryRegistry.put(Model.EKLASSE, () -> new EKlasse("Mercedes", "E-Klasse", 110));

	}

	public CarFactoryLambda<? extends Car> getCarFactoryByModel(Model model) {
		return carFactoryRegistry.get(model);
	}

}
