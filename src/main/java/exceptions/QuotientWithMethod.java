package exceptions;

import java.util.Scanner;

public class QuotientWithMethod {

	public static int quotient(int number1, int number2)  {
		return number1 / number2;
	}

	public static int quotient2(int number1, int number2) {
		if (number2==0)
			throw new RuntimeException();
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		try {
			int result = quotient2(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
//		} catch (Exception ex) {
//			System.err.println("Exception: an integer cannot be divided by zero: " + ex.getMessage());
//			throw new RuntimeException();
		} finally {
			System.out.println("Execution finishes ...");
			input.close();
		}
	}
}
