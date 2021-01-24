import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b * b);
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 2 != 0).sorted().toArray();
    }
}
