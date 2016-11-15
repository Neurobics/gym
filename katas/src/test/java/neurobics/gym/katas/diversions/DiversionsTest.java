package neurobics.gym.katas.diversions;

import org.junit.Assert;
import org.junit.Test;

/**
 Think of binary numbers: sequences of 0's and 1's. How many
 n-digit binary numbers are there that don't have two adjacent
 1 bits?

 For example, for three-digit numbers, Five of the possible
 eight combinations meet the criteria:

 000, 001, 010, 011, 100, 101, 110, 111.

 What is the number for sequences of length 4, 5, 10, n?

 n
 1 .. 2
 2 .. 3
 3 .. 5
 4 .. 8
 5 .. 13


 1 1
 2 1
 3 2
 4 3

 Having worked out the pattern, there's a second part to the
 question: can you prove why that relationship exists?

 */
public class DiversionsTest {

    @Test
    public void hat() {
        long expected = 5L;
        long actual = new Diversions(3).run();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void unicornHat() {
        long expected = 8L;
        long actual = new Diversions(4).run();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void unicornHats() {
        long expected = 13L;
        long actual = new Diversions(5).run();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void unicornCats() {
        long expected = 21L;
        long actual = new Diversions(6).run();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void unicornKittens() {
        long expected = 34L;
        long actual = new Diversions(7).run();
        Assert.assertEquals(expected, actual);
    }
}
