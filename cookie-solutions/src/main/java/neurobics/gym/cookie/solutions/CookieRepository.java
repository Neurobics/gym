package neurobics.gym.cookie.solutions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * TODO document class
 */
public class CookieRepository {

    public List<Cookie> findAll() {
        return Arrays.asList(new Cookie("chocolate", new BigDecimal(1)), new Cookie("lemon", new BigDecimal(1)));
    }
}
