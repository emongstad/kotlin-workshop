package workshop.kotlin.task1

import util.asserting

/**
 * Goal: print either "GRATTIS KOTLIN" or "GRATTIS"
 */
class KotlinNull {

    private val variable: String = "Grattis "
    private val nullableVariable: String? = if (Math.random() > 0.5) "Kotlin" else null

    fun getVariablesAsUpperCase(): String {
        return variable.uppercase() + (nullableVariable?.uppercase() ?: "")
    }
}

fun main() {
    val str = KotlinNull().getVariablesAsUpperCase()
    println(str)
    asserting(str == "GRATTIS " || str == "GRATTIS KOTLIN")
}