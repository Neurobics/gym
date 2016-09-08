package neurobics.gym.cookie.solutions;

import spark.Spark;

/**
 * NOTES:
 * - Get all cookies: a way of retrieving all cookies. cookies in a cart.
 * - LIMIT of total number of cookies per day (or per order)
 * - Order format:
 *      Array of cookies
 *      Address details
 *      Notes
 *      Delivery date
 *      (Pay on delivery or payment details)
 *      State
 */
public class CookieSolutionsAPI {

    public static void main(final String... args) {
        Spark.get("/cookies", (request, response) ->
            "cookie world"
        );
    }

}