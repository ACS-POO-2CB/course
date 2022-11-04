package inheritance;

import java.util.Objects;

public class VariousStudents {
    public static void print(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Object o = new Object();
        Person p = new Person();
        Student s = new Student();
        GraduateStudent g = new GraduateStudent();
        Student special = new GraduateStudent() {
            public String toString() {
                return "Student putin obosit dupa multi ani";
            }
        };
        print(o);
        print(p + " " + p.nume);
        print((Person) s + " / " + s.nume + " / " + ((Person) s).nume);
        print((Person) s + " / " + s.getNume() + " / " + ((Person) s).getNume());
        print(special + " / " + special.nume + " / " + ((Person) special).nume + " / " + special.getNume());

        Object[] vector = {o, p, s, g, special};
        for (Object aux : vector) {
            if (aux instanceof Student) {
                System.out.println(((Student) aux).test());
            }

            if (aux instanceof Student oNou) {
                System.out.println(oNou.test()+"!!!!");
            }
        }
    }
}

class GraduateStudent extends Student {
    String nume = "Vasile++";

    public String toString() {
        return "Student dupa multi ani";
    }

}

class Student extends Person {

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }

    String nume = "Vasile";

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
    String nume = "Ion Generic";

    public String toString() {
        return "O persoana normala";
    }

    public String getNume() {
        return nume;
    }
}
