package dataStructures.complexity

// TODO: Logarithmic Time

fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false
    val middle = numbers.size / 2

    if (value <= numbers[middle]) {
        for (index in 0..middle) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        for (index in middle until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(pseudoBinaryContains(5, numbers))
}