package neurobics.gym.katas.calcstats;

import org.junit.Assert;
import org.junit.Test;

/**

 Your task is to process a sequence of integer numbers
 to determine the following statistics:

 o) minimum value
 o) maximum value
 o) number of elements in the sequence
 o) average value

 For example: [6, 9, 15, -2, 92, 11]

 o) minimum value = -2
 o) maximum value = 92
 o) number of elements in the sequence = 6
 o) average value = 18.166666

 */
public class CalcStatsTest {

    @Test
    public void minimum() {
        int actual = new CalcStats(6, 9, 15, -2, 92, 11).minimum();
        int expected = -2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximum() {
        int actual = new CalcStats(6, 9, 15, -2, 92, 11).maximum();
        int expected = 92;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void average() {
        double actual = new CalcStats(6, 9, 15, -2, 92, 11).average();
        double expected = 21.833333333333332;
        Assert.assertEquals(expected, actual, 0.0000000001D);
    }

    @Test
    public void size() {
        int actual = new CalcStats(6, 9, 15, -2, 92, 11).size();
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

}
