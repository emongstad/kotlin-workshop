import java.util.stream.Collectors

class Language(private val name: String, private val age: Int) {
    val isAwesome = name == "Kotlin"
}

fun main2() {
    val language = Language("Kotlin", 7)
    println("the language is ${if (language.isAwesome) "awesome" else "not awesome"}")
}

fun nullSafety() {
    var a: String = "null"
//    a = null

    var b: String? = "null"
    b = if (Math.random() > 0.5) "null" else null;
//    println(b.length)
    println(b?.length)
    if (b?.uppercase() == "NULL") println("!!!")
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main1() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)

    val str = "abc"
    str.replace("a", "b")
    str.replace(oldValue = "a", newValue = "b")
    str.replace(newValue = "b", oldValue = "b")
    str.replace(oldValue = "a", newValue = "b", ignoreCase = false)
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // after the null check, 'this' is autocast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}

fun t() {
    val list = listOf(1, 2, 3)
    val mutableList = mutableListOf(1, 2, 3)
    val set = setOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")

}

fun main() {
    val list = (1..10).toList()
    list.map { it * 3 }
        .filter { it % 2 != 0 }
        .partition { it > 10 }
        .toList()
        .map { it.sum() }
}
