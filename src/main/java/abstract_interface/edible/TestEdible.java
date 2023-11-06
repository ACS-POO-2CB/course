package abstract_interface.edible;

abstract class Animal implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

class Tiger extends Animal {
    public String howToEat() {
        return "Tiger: Run!";
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
    public String howToEat() {
        return "Apple: Make apple cider";
    }

    @Override
    public void print() {
        System.out.println("I am an apple");
    }
}

class Orange extends Fruit {
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}

public class TestEdible {
    public static void main(String[] args) {
        Edible[] objects = {new Tiger(),
                new Chicken(),
                new Apple(),
                new Orange(),
                new Edible() {
                    public String howToEat() {
                        return "Mi-e foame, as manca shawarma";
                    }
                }
        };
        System.out.println(Edible.getClassNameStatic());
        for (Edible o : objects) {
            System.out.println(o.howToEat());
            o.print();
        }
    }
}