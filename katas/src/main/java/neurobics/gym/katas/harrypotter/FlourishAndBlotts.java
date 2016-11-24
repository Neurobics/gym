package neurobics.gym.katas.harrypotter;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
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
        if (basket.isEmpty()) {
            return 0;
        }

        int numberOfDifferentBooks = basket.entrySet().size();
        int kemmIlSetGhaqqadna = basket.values().stream().min(Integer::compareTo).orElseThrow(() -> new RuntimeException("Int qed iddahaq??"));

        double subtotal = 8 * numberOfDifferentBooks * kemmIlSetGhaqqadna * (1 - DISCOUNT_MAP.get(numberOfDifferentBooks));

        Map<HarryPotterBook, Integer> newMap = basket.entrySet()
                .stream()
                .map(harryPotterBookIntegerEntry -> new HashMap.SimpleEntry<>(harryPotterBookIntegerEntry.getKey(), harryPotterBookIntegerEntry.getValue() - kemmIlSetGhaqqadna))
                .filter(harryPotterBookIntegerEntry1 -> harryPotterBookIntegerEntry1.getValue() > 0)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        AbstractMap.SimpleEntry::getValue));

        Basket remainingBasket = new Basket();
        remainingBasket.putAll(newMap);

        return subtotal + buy(remainingBasket);
    }

    private double discountBy(double amount, double percentage) {
        return amount - amount * percentage;
    }

}
