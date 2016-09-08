package neurobics.gym.cookie.solutions;

import java.util.*;

/**
 * Created by ChiaraFSC on 08/09/2016.
 */
public class CookieOrder {


    private Address address;
    private String note;
    private Date deliveryDate;
    private List<Cookie> cookies = new ArrayList<>();

    public void add(Cookie... cookies) {
        this.cookies.addAll(Arrays.asList(cookies));
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Cookie> getCookies() {
        return cookies;
    }

    public Address getAddress() {
        return address;
    }
}
