package neurobics.gym.kotlin

fun isVowel(character : Char) = listOf('a', 'e', 'i', 'o', 'u').contains(character)

val String.devowel : String
    get() {

        return this
    }

fun main(args: Array<String>) {
    println("kyle".devowel)
}