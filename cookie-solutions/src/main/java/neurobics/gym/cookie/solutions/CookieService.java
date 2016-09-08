package neurobics.gym.cookie.solutions;

import java.util.UUID;

/**
 * Created by ChiaraFSC on 08/09/2016.
 */
public class CookieService {

    public String placeOrder(CookieOrder cookieOrder) {
        if (cookieOrder == null) {
            throw new IllegalArgumentException();
        }
        if (cookieOrder.getCookies() == null || cookieOrder.getCookies().isEmpty()) {
            throw new IllegalArgumentException();
        }
        return UUID.randomUUID().toString();
    }

}
