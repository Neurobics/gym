package neurobics.gym.cookie.solutions;

import java.util.UUID;

/**
 * Created by ChiaraFSC on 08/09/2016.
 */
public class CookieService {

    public String placeOrder(CookieOrder cookieOrder) {
        return UUID.randomUUID().toString();
    }

}
