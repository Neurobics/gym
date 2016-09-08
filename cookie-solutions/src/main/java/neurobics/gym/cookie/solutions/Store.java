package neurobics.gym.cookie.solutions;

import java.util.HashMap;

/**
 * Boundary between the physical storage and the external storage (for anything).
 */
public interface Store {
    <T> T persist(HashMap<Cookie, Integer> cookieOrder);
}
