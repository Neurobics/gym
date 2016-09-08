package neurobics.gym.cookie.solutions;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CookieSolutionsAPITest {

    private CookieRepository cookieRepository;

    private OrderRepository orderRepository;
    private CookieService cookieService;

    @Mock
    private Store store;

    @Before
    public void setup() {
        cookieRepository = new CookieRepository();
        orderRepository = new OrderRepository(store);
        cookieService = new CookieService();
    }

    @Test
    public void cookieRepository_getCookies_returnsAllCookies() {
        List<Cookie> cookies = cookieRepository.findAll();

        Assertions.assertThat(cookies).isNotNull();
        Assertions.assertThat(cookies).isNotEmpty();
        Assertions.assertThat(cookies).containsExactly(new Cookie("chocolate", new BigDecimal(1)),
                new Cookie("lemon", new BigDecimal(1)));
    }

    @Test
    public void api_postOrder_success() {
        // setup
        // sut
        Cookie cookie = new Cookie(null,null);
        Address address = new Address();
        CookieOrder cookieOrder = prepareCookieOrder(address, cookie, cookie);
        String orderNumber = cookieService.placeOrder(cookieOrder);
        Assertions.assertThat(orderNumber).isNotEmpty();
        //assert
        // test 201?
    }

    @Test(expected = IllegalArgumentException.class)
    public void api_noCookies_throwsException() {
        Address address = new Address();
        CookieOrder cookieOrder = prepareCookieOrder(address);
        cookieService.placeOrder(cookieOrder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void api_nullOrder_throwsException() {
        CookieOrder cookieOrder = null;
        cookieService.placeOrder(cookieOrder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void api_nullAddress_throwsException() {
        CookieOrder cookieOrder = null;
        cookieService.placeOrder(cookieOrder);
    }

    private CookieOrder prepareCookieOrder(Address address, Cookie... cookies) {
        CookieOrder cookieOrder = new CookieOrder();
        cookieOrder.add(cookies);
        cookieOrder.setAddress(address);
        cookieOrder.setDeliveryDate(new Date());
        cookieOrder.setNote("");
        return cookieOrder;
    }
}