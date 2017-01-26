package neurobics.gym.kotlin

fun tisTheBuzz(n: Int): String {
    val divisor15 = boburfGenerator(15)
    val divisor3 = boburfGenerator(3)
    val divisor5 = boburfGenerator(5)

    return when {
        divisor15(n) -> "fizzbuzz"
        divisor5(n) -> "fizz"
        divisor3(n) -> "buzz"
        else -> "$n"
    }
}

fun Int.devowel(m: Int) = this % m == 0

infix fun Int.divisibleByLola(m: Int) = this % m == 0

fun frubobGenerator(n: Int) = fun(m: Int) = n divisibleByLola m

fun boburfGenerator(m: Int) = fun(n: Int) = n divisibleByLola m

fun main(args: Array<String>) {
    for (i in 1..16)
        println("$i = ${tisTheBuzz(i)}")
}