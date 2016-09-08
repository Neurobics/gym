package neurobics.gym.cookie.solutions;

import java.util.Optional;
import java.util.UUID;

public class CookieService {



    public String placeOrder(CookieOrder cookieOrder) {
        new OrderValidator(cookieOrder).validate();
        return UUID.randomUUID().toString();
    }

    public Optional<CookieOrder> fetchOrder(String orderNumber) {
        return Optional.empty();
    }
}
