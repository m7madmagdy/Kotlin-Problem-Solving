package codeWars.kotlin


fun main() {
    print(sum(intArrayOf(1, -4, 7, 12)))
}


fun sum(numbers: IntArray): Int {
    return numbers.filter { it > 0 }.sum()
}