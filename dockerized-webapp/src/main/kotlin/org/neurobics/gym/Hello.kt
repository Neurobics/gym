package org.neurobics.gym

import spark.Spark
import spark.Spark.get

fun main(args: Array<String>) {
    get("/hello") { req, res -> "Hello World" }
    println(Spark.port())
}

