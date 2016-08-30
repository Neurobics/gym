package neurobics.gym.cookie.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CookieSolutionsAPITest {

    private CookieRepository cookieRepository;

    @Test
    public void cookieRepository_getCookies_returnsAllCookies() {
        List<Cookie> cookies = cookieRepository.findAll();

        
    }

}
