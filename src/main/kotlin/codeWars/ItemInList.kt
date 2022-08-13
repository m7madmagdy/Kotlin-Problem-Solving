package codeWars


// Link: https://www.codewars.com/kata/545991b4cbae2a5fda000158/train/kotlin


fun main() {
    val arr = intArrayOf(1, 2, 3, 4)

    println(
        include(arr, 2)
    )
}

// Solving
fun include(arr: IntArray, item: Int): Boolean {
    if (arr.contains(item)) {
        return true
    }
    return false
}
