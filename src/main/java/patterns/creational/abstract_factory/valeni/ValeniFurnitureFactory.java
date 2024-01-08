package patterns.creational.abstract_factory.valeni;

import patterns.creational.abstract_factory.generic.Chair;
import patterns.creational.abstract_factory.generic.FurnitureFactory;
import patterns.creational.abstract_factory.generic.Table;

public class ValeniFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ValeniChair();
	}

	@Override
	public Table createTable() {
		return new ValeniTable();
	}

}
