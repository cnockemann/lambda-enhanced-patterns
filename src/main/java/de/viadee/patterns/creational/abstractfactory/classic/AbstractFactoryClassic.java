package de.viadee.patterns.creational.abstractfactory.classic;

import java.util.HashMap;
import java.util.Map;

import de.viadee.patterns.creational.abstractfactory.Car;
import de.viadee.patterns.creational.abstractfactory.Model;

public class AbstractFactoryClassic {

	public static void main(String[] args) {
		AbstractFactoryClassic classicFactory = new AbstractFactoryClassic();
		Car fabia = classicFactory.getCarFactoryByModel(Model.FABIA).assemble();
		System.out.println(fabia.toJson());
		// Assembling Fabia...
		// {"brand":"Skoda","model":"Fabia","ps":54}

		Car a8 = classicFactory.getCarFactoryByModel(Model.A8).assemble();
		System.out.println(a8.toJson());
		// Assembling A8...
		// {"brand":"Audi","model":"A8","ps":190}

		Car eKlasse = classicFactory.getCarFactoryByModel(Model.EKLASSE).assemble();
		System.out.println(eKlasse.toJson());
		// Assembling E-Klasse...
		// {"brand":"Mercedes","model":"E-Klasse","ps":110}

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

	public AbstractFactoryClassic() {
		carFactoryRegistry.put(Model.FABIA, new FabiaFactory());
		carFactoryRegistry.put(Model.A8, new A8Factory());
		carFactoryRegistry.put(Model.EKLASSE, new EKlasseFactory());

	}

	protected Map<Model, CarFactoryClassic<? extends Car>> carFactoryRegistry = new HashMap<>();

	public CarFactoryClassic<? extends Car> getCarFactoryByModel(Model model) {
		return carFactoryRegistry.get(model);
	}

}
