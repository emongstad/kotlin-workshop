package workshop.kotlin.task1

import util.asserting

/**
 * Goal: print either "GRATTIS KOTLIN" or "GRATTIS"
 */
class KotlinNull {

}

fun main() {
    val str = KotlinNull().getVariablesAsUpperCase()
    asserting(str == "GRATTIS " || str == "GRATTIS KOTLIN")
}