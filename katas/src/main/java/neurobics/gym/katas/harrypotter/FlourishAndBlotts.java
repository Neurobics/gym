package neurobics.gym.katas.harrypotter;

/**
 * Created by ChiaraFSC on 13/11/2016.
 */
public class FlourishAndBlotts {

    public double buy(int i) {
        if (i == 1) {
            return 8.0;
        } else if (i == 2) {
//            return 8 * 2 - discount()
        }
        return 0;
    }

    private double discountBy(double amount, double percentage) {
        return amount - amount * percentage;
    }

}
