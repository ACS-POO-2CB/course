package fundamentals;

public class BreakContinue {
    public static void main(String[] args) {
        int number = 0, sum = 0;
        w1:
        //cuttof sum >= 100
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) break w1;
        }
        System.out.println(number+ " " + sum);

        number = 0;
        sum = 0;
        //small increments and cuttof sum >= 50
        w1:
        while (number < 20) {
            number++;
            sum += number;
            w2:
            while (sum < 100) {
                sum += number;
                if (sum >= 50) break w1;
            }
        }
        System.out.println(number+ " " + sum);

        number = 0;
        sum = 0;
        //skip 10 and 11
        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }
        System.out.println(number+ " " + sum);
    }
}
