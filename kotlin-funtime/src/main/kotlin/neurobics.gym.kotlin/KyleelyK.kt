package neurobics.gym.kotlin

val String.palindrome : Boolean
    get() = this.reversed() == this

fun main(args : Array<String>) {
    println("kyleelyk".palindrome)
}