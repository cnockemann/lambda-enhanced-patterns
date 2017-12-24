package de.viadee.patterns.lambda.strategy;

import java.util.HashMap;
import java.util.Map;


public class CarFactoryClassic {
	
	
	public static void main(String[] args) {
		CarFactoryClassic classicFactory = new CarFactoryClassic();
		Car fabia = classicFactory.assembleByModel("Fabia"); // Assembling Fabia...
		Car a8 = classicFactory.assembleByModel("A8"); // Assembling A8...
		Car eKlasse = classicFactory.assembleByModel("E-Klasse"); // Assembling E-Klasse...
		
	}
	
	Map<String, AssemblyLine> assemblyLineRegistry = new HashMap<String, AssemblyLine>();
	
	public CarFactoryClassic() {
		assemblyLineRegistry.put("Fabia", new FabiaAssembler());
		assemblyLineRegistry.put("A8", new A8Assembler());
		assemblyLineRegistry.put("E-Klasse", new EKlasseAssembler());
		
	}
	
	public Car assembleByModel(String model) {
		return assemblyLineRegistry.get(model).assemble();
	}

	public interface AssemblyLine{
		
		Car assemble();
		
	}
	
	public class FabiaAssembler implements AssemblyLine{

		@Override
		public Car assemble() {
			System.out.println("Assembling Fabia...");
			return new Car("Skoda", "Fabia", 54);
		}
		
	}
	
	public class A8Assembler implements AssemblyLine{

		@Override
		public Car assemble() {
			System.out.println("Assembling A8...");
			return new Car("A8", "Audi", 190);
		}
		
	}
	
	public class EKlasseAssembler implements AssemblyLine{

		@Override
		public Car assemble() {
			System.out.println("Assembling E-Klasse...");
			return new Car("E-Klasse", "Mercedes", 110);
		}
		
	}
	
	
	
	
	private class Car{
		private String brand;
		
		private String model;
		
		private int ps;
		

		public Car(String brand, String model, int ps) {
			super();
			this.brand = brand;
			this.model = model;
			this.ps = ps;
		}

		// getters and setters
	}
	
	
}
