package workshop.kotlin.task2

import util.asserting
import kotlin.streams.toList


fun String?.isHelloWorld() =
    this == "Hello World"

fun String.hasCharsInAlphabeticalOrder() =
    this.chars().sorted().toList() == this.chars().toList()

/**
 * Rewrite JavaUtilityFunction using Kotlin's extension function
 */
fun main() {
    asserting("Hello World".isHelloWorld())
    val str = "foobar"
    asserting(!str.isHelloWorld())
    asserting(!null.isHelloWorld())

    asserting("aegilops".hasCharsInAlphabeticalOrder())
    asserting(!"onomatopoetikon".hasCharsInAlphabeticalOrder())
}
