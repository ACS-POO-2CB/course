package fundamentals;

public class StrangeOperators {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111
        System.out.println((a & b) + " " + (a | b) + " " + (a ^ b)); // bitwise AND, OR, XOR

        int c = 11, d = 9;
        System.out.println(c++ + " " + ++d);

        a = a - b + c - d;
        System.out.println(a);

        a = b += c = 5;
        System.out.println(a + " " + b + " " + c);

        char ch = 'C'; // ASCII vzalue of 'C' is 67
        int i = +ch;
        int j = -ch;
        int k = ch += 'c'; // ASCII value of 'c' is 99
        System.out.println(i + " " + j + " " + k);
    }
}
