package patterns.creational.abstract_factory.ikea;

import patterns.creational.abstract_factory.generic.FurnitureFactory;

public class IkeaFactory implements FurnitureFactory {

    @Override
    public IkeaChair createChair() {
        return new IkeaChair();
    }

    @Override
    public IkeaTable createTable() {
        return new IkeaTable();
    }
}
