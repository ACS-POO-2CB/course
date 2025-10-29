package inheritance;

import java.util.Objects;

class Person {
    final int age;
    String name = "Alex";

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "O persoana normala";
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    String name = "Ioana";

    public Student(int age, String name, String codeName) {
        super(age, name);
        this.name = codeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, super.name, 42);
    }

    public String toString() {
        return "Student normal";
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return super.name;
    }

    public String test() {
        return "Quiz cu succes";
    }
}

class GraduateStudent extends Student {
    String name;

    public GraduateStudent(int age) {
        super(age, "MSc++", "MSc++");
        this.name = "Claudiu";
    }

    public String toString() {
        return "Student dupa multi ani";
    }

}

public class VariousStudents {
    public static void print(Object x) {
        System.out.println(x);
    }

    public static void print(Student x) {
        System.out.println("WOW! " + x);
    }

    public static void main(String[] args) {
        Object o = new Object();
        Person p = new Person(21, "Costel");
        Student s = new Student(20, "Cornel", "C++");
        GraduateStudent g = new GraduateStudent(25);

        GraduateStudent special = new GraduateStudent(40) {
            private String name = "Vasile--";

            public String toString() {
                return name + ": Student putin obosit dupa multi ani";
            }
        };

        print(o);
        print(s);
        print(p + " " + p.name);
        print((Person) s + " / " + s.name + " / " + ((Person) s).name);
        print((Person) s + " / " + s.getName() + " / " + ((Person) s).getName());
        print(special + " / " + special.name + " / " + ((Person) special).name + " / " + special.getName());

        System.out.println("------------");
        Object[] vector = {o, p, s, g, special};
        for (Object el : vector) {
            if (el instanceof Student stud) {
                System.out.println(stud.name + ": " + stud.test() + "!!!!");
            }
        }
    }
}






