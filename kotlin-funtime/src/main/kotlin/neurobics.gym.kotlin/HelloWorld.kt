package neurobics.gym.kotlin

fun tisTheBuzz(n: Int): String {

    return when {
        divisibleBy(n, 15) -> "fizzbuzz"
        divisibleBy(n, 3) -> "fizz"
        divisibleBy(n, 5) -> "buzz"
        else -> "$n"
    }
}

infix fun Int.divisibleBy(m: Int) = this % m == 0

fun main(args: Array<String>) {
    for (i in 1..16)
        println("$i = ${tisTheBuzz(i)}")
}