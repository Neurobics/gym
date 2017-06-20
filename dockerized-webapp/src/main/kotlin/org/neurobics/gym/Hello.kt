package org.neurobics.gym

import spark.Spark.get
import spark.Spark.port

fun main(args: Array<String>) {
    get("/") { req, res -> "Welcome to the Neurobics gym!" }
    get("/hello") { req, res -> "Hello ${args[0]}"}
    println("http://localhost:" + port() + "/hello")
}

