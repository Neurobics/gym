package neurobics.gym.cookie.solutions;

import org.assertj.core.api.Assertions;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public void placeOrder_postOrder_success() {
        Cookie cookie = new Cookie(null, null);
        Address address = new Address();
        CookieOrder cookieOrder = prepareCookieOrder(address, cookie, cookie);
        String orderNumber = cookieService.placeOrder(cookieOrder);
        Assertions.assertThat(orderNumber).isNotEmpty();
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeOrder_noCookies_throwsException() {
        Address address = new Address();
        CookieOrder cookieOrder = prepareCookieOrder(address);
        cookieService.placeOrder(cookieOrder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeOrder_nullOrder_throwsException() {
        CookieOrder cookieOrder = null;
        cookieService.placeOrder(cookieOrder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeOrder_nullAddress_throwsException() {
        CookieOrder cookieOrder = prepareCookieOrder(null, new Cookie(null,null));
        cookieService.placeOrder(cookieOrder);
    }

    @Test
    public void fetchOrder_validOrderNumber_returnsOrder() {
        CookieOrder cookieOrder = prepareCookieOrder();
        String orderNumber = assumeOrderExists(cookieOrder);

        CookieOrder order = cookieService.fetchOrder(orderNumber);
        Assertions.assertThat(order).isNotNull().isEqualTo(cookieOrder);
    }

    @Test
    public void fetchOrder_nonExistentOrderNumber_returnsEmptyOptional() {
        CookieOrder order = cookieService.fetchOrder("123");
        Assertions.assertThat(order).isNotNull().isEqualTo(Optional.empty());
    }
    /**
     *
     *
     * someStorage <= is a spy
     *
     *
     * cookieService = cookieService.injectDeps(someStorage)
     * ====
     *
     *
     *
     * cookieService.fetchOrder(orderNumber);
     * someStorage.getById.calledWith(orderNumber)
     *
     *
     *
     * cookieService.createOrder(orderNumber);
     * someStorage.persist.calledWith(orderNumber)
     *
     * @return
     */

    private CookieOrder prepareCookieOrder() {
        return prepareCookieOrder(new Address(), new Cookie(null, null));
    }

    private CookieOrder prepareCookieOrder(Address address, Cookie... cookies) {
        CookieOrder cookieOrder = new CookieOrder();
        cookieOrder.add(cookies);
        cookieOrder.setAddress(address);
        cookieOrder.setDeliveryDate(new Date());
        cookieOrder.setNote("");
        return cookieOrder;
    }

    private String assumeOrderExists(CookieOrder cookieOrder) {
        String orderNumber = cookieService.placeOrder(prepareCookieOrder());
        Assume.assumeNotNull(orderNumber);
        return orderNumber;
    }
}