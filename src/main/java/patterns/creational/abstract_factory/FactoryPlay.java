package patterns.creational.abstract_factory;

import java.util.List;

import patterns.creational.abstract_factory.generic.FurnitureFactory;
import patterns.creational.abstract_factory.ikea.IkeaFactory;
import patterns.creational.abstract_factory.valeni.ValeniFurnitureFactory;

public class FactoryPlay {

    public static void main(String[] args) {
        FurnitureFactory valeniFactory = new ValeniFurnitureFactory();
        FurnitureFactory ikeaFactory = new IkeaFactory();

        Distributor valeniDistributor = new Distributor(valeniFactory);
        Distributor ikeaDistributor = new Distributor(ikeaFactory);

        List<Object> kitchen = valeniDistributor.getKitchenFurniture();

        System.out.println("Delivered products: " + kitchen);

        IO.println("Default products: " + valeniFactory.getDefaultOrder());

        kitchen = ikeaDistributor.getKitchenFurniture();

        System.out.println("Delivered products: " + kitchen);

        IO.println("Default products: " + ikeaFactory.getDefaultOrder());
    }
}
