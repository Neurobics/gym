package neurobics.gym.kotlin

fun tisTheBuzz(n: Int): String {
    var a = frubobGenerator(n);
    return with (n) {
        when {
            a(15) -> "fizzbuzz"
            frubob(3) -> "fizz"
            this lola 5 -> "buzz"
            else -> "$n"
        }
    }
}

fun Int.frubob(m: Int) = this % m == 0

infix fun Int.lola(m: Int) = this % m == 0

fun frubobGenerator(n: Int) = fun (m: Int) = true

fun main(args: Array<String>) {
    for (i in 1..16)
        println("$i = ${tisTheBuzz(i)}")
}