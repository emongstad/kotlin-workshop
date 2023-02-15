package workshop.kotlin.task4

import util.asserting

class KotlinSealedClass {

    /**
     * Use sealed class with data class and/or objects to create
     */
    fun function(): Response {
        val random = (Math.random() * 100).toInt()
        return when {
            random < 33 -> KotlinLessThan33(random)
            random < 67 -> KotlinLessThan67(random)
            random < 99 -> KotlinLessThan99(random)
            else -> Kotlin99
        }
    }
}

sealed class Response
data class KotlinLessThan33(val lowValue: Int) : Response()
data class KotlinLessThan67(val midValue: Int) : Response()
data class KotlinLessThan99(val highValue: Int) : Response()
object Kotlin99 : Response()

fun main() {
    when (val response = KotlinSealedClass().function()) {
        is KotlinLessThan33 -> asserting(response.lowValue in 0..32)
        is KotlinLessThan67 -> asserting(response.midValue in 33..66)
        is KotlinLessThan99 -> asserting(response.highValue in 33..98)
        Kotlin99 -> println(99)
    }
}