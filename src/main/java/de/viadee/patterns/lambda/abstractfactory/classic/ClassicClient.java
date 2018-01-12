package de.viadee.patterns.lambda.abstractfactory.classic;

import java.util.HashMap;
import java.util.Map;

import de.viadee.patterns.lambda.abstractfactory.Car;
import de.viadee.patterns.lambda.abstractfactory.Model;

public class ClassicClient {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassicClient classicFactory = new ClassicClient();
		Car fabia = classicFactory.getCarFactoryByModel(Model.FABIA).assemble();
		Car a8 = classicFactory.getCarFactoryByModel(Model.A8).assemble();
		Car eKlasse = classicFactory.getCarFactoryByModel(Model.EKLASSE).assemble();
		// Assembling Fabia...
		// Assembling A8...
		// Assembling E-Klasse...

		System.out.println("\nAssemble 3 Fabias in a row:");
		for (int i = 0; i < 3; i++) {
			String json = classicFactory.getCarFactoryByModel(Model.FABIA).assemble().toJson();
			System.out.println(json);
		}
		// Assemble 3 Fabias in a row:
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":54}
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":54}
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":54}

	}

	public ClassicClient() {
		carFactoryRegistry.put(Model.FABIA, new FabiaFactory());
		carFactoryRegistry.put(Model.A8, new A8Factory());
		carFactoryRegistry.put(Model.EKLASSE, new EKlasseFactory());

	}

	protected Map<Model, CarFactoryClassic<? extends Car>> carFactoryRegistry = new HashMap<>();

	public CarFactoryClassic<? extends Car> getCarFactoryByModel(Model model) {
		return carFactoryRegistry.get(model);
	}

}
