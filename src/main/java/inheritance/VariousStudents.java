package inheritance;

import java.util.Objects;

public class VariousStudents {
    public static void print(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Object o = new Object();
        Person p = new Person(21, "Costel");
        Student s = new Student(20, "Cornel", "Cornel");
        GraduateStudent g = new GraduateStudent(25);
        Student special = new GraduateStudent(40) {
            public String toString() {
                return "Student putin obosit dupa multi ani";
            }
        };

        print(o);
        print(p + " " + p.nume);
        print((Person) s + " / " + s.nume + " / " + ((Person) s).nume);
        print((Person) s + " / " + s.getNume() + " / " + ((Person) s).getNume());
        print(special + " / " + special.nume + " / " + ((Person) special).nume + " / " + special.getNume());

        System.out.println("------------");
        Object[] vector = {o, p, s, g, special};
        for (Object aux : vector) {
            if (aux instanceof Student) {
                System.out.println(((Student) aux).test());
            }

            if (aux instanceof Student studentNou) {
                System.out.println(studentNou.test()+"!!!!");
            }
        }
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(int age) {
        super(age, "Vasile++", "Vasile++");
        this.nume = "Vasile++";
    }

    String nume ;

    public String toString() {
        return "Student dupa multi ani";
    }

}

class Student extends Person {
    String nume = "Vasile";

    public Student(int age, String nume, String numePropriu) {
        super(age, nume);
        this.nume = numePropriu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nume,super.nume);
    }


    public String toString() {
        return "Student normal";
    }

    @Override
    public String getNume() {
        return nume;
    }

    public String test() {
        return "Quiz cu succes";
    }
}

class Person {
    final int age ;
    String nume = "Alex";

    public Person(int age, String nume) {
        this.age = age;
        this.nume = nume;
    }

    public String toString() {
        return "O persoana normala";
    }

    public String getNume() {
        return nume;
    }
}
