package neurobics.gym.katas.harrypotter;

/**
 * Created by ChiaraFSC on 13/11/2016.
 */
public class FlourishAndBlotts {

    public double buy(Basket basket) {
        basket.keySet().size();
        if (basket == 1) {
            return 8.0;
        } else if (basket == 2) {
            return discountBy(8 * 2, 0.05);
        }
        return 0;
    }

    private double discountBy(double amount, double percentage) {
        return amount - amount * percentage;
    }

}
