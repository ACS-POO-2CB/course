package patterns.creational.factory_method;

// Concrete Factories
class DogFactory extends AnimalFactory {
    @Override
    Dog createAnimal() {
        return new Dog();
    }
}


