package patterns.creational.factory_method;

class CatFactory extends AnimalFactory {
    @Override
    Cat createAnimal() {
        return new Cat();
    }
}

