package workshop.kotlin.task3

import util.asserting

class KotlinOverloading {
    private var name = "Tom Bombadill"
    private var age = 759
    private var gender = KotlinGender.Male

    /**
     * Implement a single override functions which covers the functionality in JavaOverloading's multiple override-functions
     */
    fun override() {}

    override fun toString() = "$name $age $gender"
}

enum class KotlinGender {
    Male, Female
}

fun main() {
    asserting(KotlinOverloading().override(name = "Per Bombadill") == "Per Bombadill 759 Male")
    asserting(KotlinOverloading().override(age = 123) == "Tom Bombadill 123 Male")
    asserting(KotlinOverloading().override(gender = KotlinGender.Female) == "Tom Bombadill 759 Female")
    asserting(KotlinOverloading().override(name = "Per Bombadill", age = 123) == "Per Bombadill 123 Male")
    asserting(KotlinOverloading().override(age = 123, gender = KotlinGender.Female) == "Tom Bombadill 123 Female")
    asserting(KotlinOverloading().override(name = "Per Bombadill", gender = KotlinGender.Female) == "Per Bombadill 759 Female")
    asserting(KotlinOverloading().override(name = "Per Bombadill", age = 123, gender = KotlinGender.Female) == "Per Bombadill 123 Female")
}