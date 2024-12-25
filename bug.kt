fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //The following line will cause an error if the list is empty
    val firstDoubled = doubledList.first()
    println(firstDoubled)
}