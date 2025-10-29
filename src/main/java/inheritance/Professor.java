package inheritance;

public class Professor extends Human {
    int age;

    public Professor(int varsta) {
        super(varsta);
        this.age = 3 * varsta;
    }

    public void speak() {
        System.out.println("10 ai facut foarte bine!");
        super.speak();
    }

    public static void main(String[] args) {
        Professor professor = new Professor(20);
        System.out.println(professor.age);
        System.out.println(((Human) professor).age);
        System.out.println(((Entity) professor).age);

        System.out.println("------------");
        professor.speak();
        ((Human) professor).speak();
        ((Entity) professor).speak();
    }
}

class Human extends Entity {
    int age;

    public Human(int age) {
        super(age);
        this.age = 2 * age;
    }

    public void speak() {
        System.out.println("Urmeaza statia Politehnica cu peronul pe partea stanga!");
        super.speak();
    }
}

class Entity {
    int age;

    public Entity(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("I am alive!");
    }
}