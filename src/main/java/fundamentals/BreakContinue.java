package fundamentals;

public class BreakContinue {
    public static void main(String[] args) {
        int number = 0, sum = 0;
        //cuttof sum >= 100
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) break;
        }
        System.out.println(number + " " + sum);

        number = 0;
        sum = 0;
        //small increments and cuttof sum >= 50
        outerLoop:
        while (number < 20) {
            number++;
            sum += number;
            innerLoop:
            while (sum < 100) {
                sum += number;
                if (sum >= 50) break outerLoop;
            }
        }
        System.out.println(number + " " + sum);

        number = 0;
        sum = 0;
        //skip 10 and 11
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
        }
        System.out.println(number + " " + sum);
    }
}
