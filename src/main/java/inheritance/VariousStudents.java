package inheritance;

public class VariousStudents {
    public static void m(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        m(new Object());
        m(new Person());
        m((Person)new Student());
        m((Object)new GraduateStudent(){
            public String toString() {
                return "Student putin obosit dupa multi ani";
            }
        });

        Object o = new Student();
        if (o instanceof Student o1) {
            System.out.println(o1.test());
        }
    }
}

class GraduateStudent extends Student {
    public String toString() {
        return "Student dupa multi ani";
    }

}

class Student extends Person {
    public String toString() {
        return "Student normal";
    }
    public String test() { return "Quiz cu succes";}
}

class Person extends Object {
    public String toString() {
        return "O persoana normala";
    }
}
