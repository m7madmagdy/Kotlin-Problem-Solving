package codeWars.kyu8


fun main() {
    print(sum(intArrayOf(1, -4, 7, 12)))
}


//Solution
fun sum(numbers: IntArray): Int {
    return numbers.filter { it > 0 }.sum()
}