package fundamentals;

/**
 * This class represents a student.
 *
 * @author Seria CB
 * @version 1.0
 */


public class Student {
    public static void main(String[] args) {
        System.out.println("Seria CB!!");
        double avgHeight = 1.75;
        double avgWeight = 70;

        double avgBMI = avgWeight / Math.pow(avgHeight, 2);

        System.out.println("Average BMI: " + Math.round(avgBMI));
    }
}

