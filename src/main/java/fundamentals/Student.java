package fundamentals;

import java.util.Scanner;

/**
 * This class represents a student.
 *
 * @author Seria CB
 * @version 1.0
 */


public class Student {

    String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static void main(String[] args) {
        System.out.println("Seria CB!!");
        double avgHeight = 1.75;
        double avgWeight = 70;

        double avgBMI = avgWeight / Math.pow(avgHeight, 2);

        System.out.println("Average BMI: " + Math.round(avgBMI));

        Student s = new Student();
        s.nume = new String("Ana are mere");
        System.out.println("|"+s.nume.toString()+"|");
    }
}

