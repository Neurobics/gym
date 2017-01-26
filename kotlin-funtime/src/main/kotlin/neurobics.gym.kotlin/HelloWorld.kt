package neurobics.gym.kotlin

fun tisTheBuzz(n: Int): String {
    return if (n% 15 == 0) "fizz buzz" else if (n%5 == 0) "buzz" else if (n%3 == 0) "fizz" else "$n"
}


fun main(args: Array<String>) {
    // n
    // n div by 3 fizz
    // n div by 5 buzz
    // n div by 3 and 5 fizz buzz
    // ...
    // profit

    for (i in 1..16)
        println("$i = ${tisTheBuzz(i)}")
}