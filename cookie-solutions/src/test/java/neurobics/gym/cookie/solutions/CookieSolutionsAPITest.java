package neurobics.gym.cookie.solutions;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class CookieSolutionsAPITest {

    private CookieRepository cookieRepository;

    @Before
    public void setup() {
        cookieRepository = new CookieRepository();
    }

    @Test
    public void cookieRepository_getCookies_returnsAllCookies() {
        List<Cookie> cookies = cookieRepository.findAll();

        Assertions.assertThat(cookies).isNotNull();
        Assertions.assertThat(cookies).isNotEmpty();
        Assertions.assertThat(cookies).containsExactly(new Cookie("chocolate", new BigDecimal(1)),
                new Cookie("lemon", new BigDecimal(1)));
    }

    // TEST: Post order with cookies that we need to order.




}