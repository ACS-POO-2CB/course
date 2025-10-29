package inheritance;

public class Supercar extends Vehicle {

    private Integer hp;
    String name;

    Supercar(Integer hp) {
        this.name = "Lamborghini";
        super.name = "VW";
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
        super.name = "Super " + name;
    }

    public String getName() {
        return super.getName() + "| Supercar !";
    }

    public Supercar getObject() {
        return this;
    }

    public static void print() {
        IO.println("Supercar");
    }

    public static void check(Object m) {
        System.out.println(((Supercar) m).name);
        System.out.println(((Vehicle) m).name);
        System.out.println(((Supercar) m).getName());
        System.out.println(((Vehicle) m).getName());
    }

    public void check() {
        System.out.println(((Supercar) this).name);
        System.out.println(((Vehicle) this).name);
        System.out.println(((Supercar) this).getName());
        System.out.println(((Vehicle) this).getName());
    }

    public static void main(String[] args) {
        Supercar car = new Supercar( 500);

        System.out.println(car.name);
        System.out.println(car.getName());
        System.out.println("-----------------");

        check(car);
        System.out.println("-----------------");

        car.setName("Ferrari");
        car.check();
        System.out.println("-----------------");

        car.print();
        ((Vehicle)car).print();
    }
}

class Vehicle {

    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
        this.name = "Dacia";
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Vehicle getObject() {
        return this;
    }

    public static void print() {
        IO.println("Simple car");
    }
}
