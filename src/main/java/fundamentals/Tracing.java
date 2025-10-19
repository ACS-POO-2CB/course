package fundamentals;

import java.util.Arrays;

public class Tracing {
    public static void main(String[] args) {
        int[] values = new int[5];
        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i-1];
        }
        values[0] = values[1] + values[4];
        IO.println(values);
        IO.println(values.length);
        IO.println(Arrays.toString(values));
    }
}
