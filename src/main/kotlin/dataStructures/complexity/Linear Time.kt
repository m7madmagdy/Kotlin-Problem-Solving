package dataStructures.complexity

// TODO: This function prints all the names in a String list. As the input list increases in size,
//  the number of iterations is increased by the same amount.
//  This behavior is known as linear time complexity:
//  Linear Time
fun printNames(names: MutableList<String>) {
    for (name in names) {
        println(name)
    }
}

fun linearContains(value: Int, numbers: List<Int>): Boolean {
    for (element in numbers) {
        if (element == value) {
            return true
        }
    }
    return false
}

fun main() {
    val names = mutableListOf("John", "Jane", "Joe")
    printNames(names)

    val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)
    println(linearContains(105, numbers))
}
// TODO: Linear time complexity is usually the easiest to understand. As the amount of data
//  increases, the running time increases by the same amount. That’s why you have the
//  straight linear graph illustrated above. The Big O notation for linear time is O(n).