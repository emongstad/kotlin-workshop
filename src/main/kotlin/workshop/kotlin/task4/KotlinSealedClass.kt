package workshop.kotlin.task4

import util.asserting

class KotlinSealedClass {

    /**
     * Use sealed class with data class and/or objects to create
     */
    fun function(): Response {
    }
}

sealed class Response

fun main() {
    when (val response = KotlinSealedClass().function()) {
        is KotlinLessThan33 -> asserting(response.lowValue in 0..32)
        is KotlinLessThan67 -> asserting(response.midValue in 33..66)
        is KotlinLessThan99 -> asserting(response.highValue in 33..98)
        Kotlin99 -> println(99)
    }
}