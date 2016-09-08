package neurobics.gym.cookie.solutions;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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

    // TEST: Post order with cookies that we need to order.
    @Test
    public void cookieRepository_createOrder() {
        HashMap<Cookie, Integer> cookieOrder = new HashMap<>();
        orderRepository.create(cookieOrder);

        Mockito.verify(store.persist(cookieOrder));
    }

    @Test
    public void api_postOrder() {
        // setup
        // sut
        Cookie cookie = new Cookie(null,null);
        List<Cookie> cookies = new ArrayList<>();
        CookieOrder cookieOrder = new CookieOrder();
        Address address = new Address();
        cookieOrder.add(cookie);
        cookieOrder.setAddress(address);
        cookieOrder.setDeliveryDate(new Date());
        cookieOrder.setNote("");
        String orderNumber = cookieService.placeOrder(cookieOrder);
        Assertions.assertThat(orderNumber).isNotEmpty();
        //assert
        // test 201?
    }



}