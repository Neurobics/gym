package neurobics.gym.katas.harrypotter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:mail@kylepullicino.com">Kyle</a>
 */
public class Basket {

    private final Map<HarryPotterBook, Integer> books;

    public Basket() {
        this.books = new HashMap<>();
    }

    public Integer put(HarryPotterBook key, Integer value) {
        return books.put(key, value);
    }
}
