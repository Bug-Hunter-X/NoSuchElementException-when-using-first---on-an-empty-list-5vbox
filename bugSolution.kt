fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //The following line uses firstOrNull() to handle an empty list scenario.
    val firstDoubled = doubledList.firstOrNull() ?: 0
    println(firstDoubled)

    val emptyList = emptyList<Int>()
    val firstOfEmptyList = emptyList.firstOrNull() ?: 0
    println(firstOfEmptyList) //Prints 0
} 