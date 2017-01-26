package neurobics.gym.kotlin

fun isVowel(character : Char) = listOf('a', 'e', 'i', 'o', 'u').contains(character)

private fun devowel(s: String): String {
    if (s.isEmpty()) return ""

    val head = s[0]
    val result = if (isVowel(head)) "" else "$head"

    return result + devowel(s.substring(1))
}

fun main(args: Array<String>) {
    println(devowel("kyle"))
}