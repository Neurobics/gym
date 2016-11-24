package neurobics.gym.katas.harrypotter;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FlourishAndBlotts {


    private static final HashMap<Integer, Double> DISCOUNT_MAP = new HashMap<>();
    static {
        DISCOUNT_MAP.put(1, 0.0);
        DISCOUNT_MAP.put(2, 0.05);
        DISCOUNT_MAP.put(3, 0.10);
        DISCOUNT_MAP.put(4, 0.20);
        DISCOUNT_MAP.put(5, 0.25);
    }

    public double buy(Basket basket) {
//        basket
//        basket.entrySet().size() == HarryPotterBook.values().length

        int numberOfDifferentBooks = basket.entrySet().size();
        int kemmIlSetGhaqqadna = basket.values().stream().min(Integer::compareTo).orElseThrow(() -> new RuntimeException("Int qed iddahaq??"));


        double subtotal = 8 * numberOfDifferentBooks * kemmIlSetGhaqqadna * DISCOUNT_MAP.get(numberOfDifferentBooks);


        basket.entrySet().stream().collect(Collectors.toMap(harryPotterBookIntegerEntry -> ));

        return ((8 * 5) - ((8 * 5) * .25)) + ((8 * 3) - (8 * 3) * .1);
    }

    private double discountBy(double amount, double percentage) {
        return amount - amount * percentage;
    }

}
