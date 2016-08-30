package neurobics.gym.cookie.solutions;

import spark.Spark;

public class CookieSolutionsAPI {

    public static void main(final String... args) {
        Spark.get("/cookies", (request, response) ->
            "cookie world"
        );
    }

}
