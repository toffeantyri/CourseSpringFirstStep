package algorithms

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val defaultList: List<Int> = generateIntArray(5)
    println("default list")
    println(defaultList)

    val sortedList = defaultList.toMutableList().apply { sort() }
    println("sorted list")
    println(sortedList)

    val bubbleSortedList = bubbleSort(defaultList.toMutableList())
    println("bubble list")
    println(bubbleSortedList)

}

fun generateIntArray(capasity: Int): MutableList<Int> {
    val list = mutableListOf<Int>()
    repeat(capasity) {
        list.add((0..capasity).random())
    }
    return list
}

fun bubbleSort(list: MutableList<Int>): MutableList<Int> {
    var sorted = false
    while (!sorted) {

        var moved = true

        while (moved) {
            moved = false
            for (i in list.indices) {
                if (i < list.lastIndex) {
                    if (list[i] > list[i + 1]) {
                        val temp = list[i + 1]
                        list[i + 1] = list[i]
                        list[i] = temp
                        moved = true
                    }
                }
            }
        }
        sorted = true
    }
    return list
}