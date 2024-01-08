package patterns.creational.abstract_factory;

import java.util.Arrays;
import java.util.List;

import patterns.creational.abstract_factory.generic.FurnitureFactory;

public class Distributor {

	private final FurnitureFactory factory;

	public Distributor(FurnitureFactory factory) {
		this.factory = factory;
	}

	public List<Object> getKitchenFurniture() {
		List<Object> products = Arrays.asList(
			factory.createTable(),
			factory.createChair(),
			factory.createChair(),
			factory.createTable(),
			factory.createChair()
		);
		return products;
	}
}
