package codeWars.kyu7

fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    return array.filter { it % 2 == 0 }.takeLast(number)
}

fun main() {
    println(evenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 3))
}
