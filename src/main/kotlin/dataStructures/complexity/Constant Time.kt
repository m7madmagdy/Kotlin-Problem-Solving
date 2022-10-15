package dataStructures.complexity

// Constant Time
fun checkFirst(names: MutableList<String>) {
    if (names.first() == "MEGO") {
        println(names.first())
    } else {
        println("no names")
    }
}

fun main() {
    val names = mutableListOf("Jane", "Jane", "Joe")
    checkFirst(names)
}

// This is Algorithm O(1) Constant Time

// The size of names does not affect the running time of this function. Whether names
// has 10 items or 10 million items, this function only checks the first element of the list.

// TODO: Time
// |
// |
// |
// |
// |  "Constant Time"
// |___________________________________
// |
// |
// |________________________________________ TODO: DATA
