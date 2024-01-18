package patterns.creational.abstract_factory;

import java.util.List;

import patterns.creational.abstract_factory.generic.FurnitureFactory;
import patterns.creational.abstract_factory.valeni.ValeniFurnitureFactory;

public class FactoryPlay {

	public static void main(String[] args) {
		FurnitureFactory factory = new ValeniFurnitureFactory();

		Distributor distributor = new Distributor(factory);

		List<Object> kitchen = distributor.getKitchenFurniture();

		System.out.println("Delivered products: " + kitchen);
	}
}
