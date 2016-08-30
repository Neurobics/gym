package neurobics.gym.cookie.solutions;

import java.math.BigDecimal;

/**
 * TODO document class
 */
public class Cookie {

    private final String flavour;
    private final BigDecimal price;

    public Cookie(final String flavour, final BigDecimal price) {
        this.price = price;
        this.flavour = flavour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Cookie cookie = (Cookie) o;

        if (flavour != null ? !flavour.equals(cookie.flavour) : cookie.flavour != null)
            return false;
        return price != null ? price.equals(cookie.price) : cookie.price == null;

    }

    @Override
    public int hashCode() {
        int result = flavour != null ? flavour.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
