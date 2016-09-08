package neurobics.gym.cookie.solutions;

import java.util.Date;
import java.util.List;

/**
 * Created by ChiaraFSC on 08/09/2016.
 */
public class CookieOrder {


    private Address address;
    private String note;
    private Date deliveryDate;

    public void add(Cookie... cookies) {

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
}
