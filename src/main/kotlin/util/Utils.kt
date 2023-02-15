package util

fun asserting(value: Boolean) {
    if (!value)
        throw AssertionError("Assertion failed")
}