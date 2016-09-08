package neurobics.gym.cookie.solutions;

/**
 * Created by ChiaraFSC on 08/09/2016.
 */
class OrderValidator {
    private CookieOrder cookieOrder;

    public OrderValidator(CookieOrder cookieOrder) {
        this.cookieOrder = cookieOrder;
    }

    public void validate() {
        if (cookieOrder == null) {
            throw new IllegalArgumentException();
        }
        if (cookieOrder.getCookies() == null || cookieOrder.getCookies().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (cookieOrder.getAddress() == null) {
            throw new IllegalArgumentException();
        }
    }
}
