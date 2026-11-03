package basic_objects;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Student rebel;

    static void main(String[] args) {
        Student student = new Student("John Doe");
        IO.println("Student name: " + student.getName());

        IO.println("Student name: " + rebel.getName());
    }
}
