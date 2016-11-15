package neurobics.gym.katas.diversions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diversions {

    private final int n;

    public Diversions(int n) {
        this.n = n;
    }

    private List<String> calculatePermutations(int n) {
        return IntStream.range(0, (int) Math.pow(2.0, n)).mapToObj(Integer::toBinaryString).collect(Collectors.toList());
    }

    public long run2() {
        return calculatePermutations(n).stream().filter(ass -> !hasAdjacentOnes(ass)).count();
    }

    public long run() {
        return fib(n+2);
    }

    private long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    private boolean hasAdjacentOnes(String bobass) {
        System.out.println(bobass);
        return bobass.contains("11");
    }
}
