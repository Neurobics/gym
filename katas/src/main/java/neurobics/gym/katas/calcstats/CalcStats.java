package neurobics.gym.katas.calcstats;

import java.util.stream.IntStream;

public class CalcStats {
    private final int[] numbers;
    private double aDouble;

    public CalcStats(int... numbers) {
        this.numbers = numbers;
    }

    public int minimum() {
        return IntStream.of(numbers).min().orElseThrow(() -> new IllegalStateException("No numbers present."));
    }

    public int maximum() {
        return IntStream.of(numbers).max().orElseThrow(() -> new IllegalStateException("No numbers present."));
    }

    public double average() {
        aDouble = IntStream.of(numbers).average().orElseThrow(() -> new IllegalStateException("No numbers present."));
        return aDouble;
    }

    public int size() {
        return numbers.length;
    }
}
