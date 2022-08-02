package codeWars

//Link: https://www.codewars.com/kata/554b4ac871d6813a03000035/train/kotlin


fun main() {
    print(
        highAndLow("1 2 3 4 5")
    )
}

//Solution
fun highAndLow(numbers: String): String {
    val numbersList = numbers.split(" ")
    val numbersListInt = numbersList.map { it.toInt() }
    val min = numbersListInt.minOf { it }
    val max = numbersListInt.maxOf { it }
    return "$max $min"
}