package neurobics.gym.katas.harrypotter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basket {
    public Set<HarryPotterBook> keySet() {
        return books.keySet();
    }

    public Set<Map.Entry<HarryPotterBook, Integer>> entrySet() {
        return books.entrySet();
    }

    private final Map<HarryPotterBook, Integer> books;

    public Basket() {
        this.books = new HashMap<>();
    }

    public Integer put(HarryPotterBook key, Integer value) {
        return books.put(key, value);
    }
}
