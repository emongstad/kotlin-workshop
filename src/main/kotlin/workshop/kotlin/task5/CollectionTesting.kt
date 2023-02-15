package workshop.kotlin.task5

import util.asserting

fun main() {
    val list = (1..9).toList()
    asserting(list.getOdd() == listOf(1, 3, 5, 7, 9))
    asserting(list.getSumOfEven() == 20)

    val stringList = listOf("agoiuh", "hethsr", "sfderah", "ddaaaedwe")
    asserting(stringList.getNumberOfCharacters() == listOf(6, 6, 7, 9))
    asserting(stringList.findLastStringWhichContainsTheCharacter('r') == "sfderah")

    asserting(stringList.countPerCharacterInTheLongestWord() == listOf('a' to 3, 'd' to 3, 'e' to 2, 'w' to 1))
}
