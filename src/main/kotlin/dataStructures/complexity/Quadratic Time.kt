package dataStructures.complexity

//TODO: Quadratic Time
// More commonly referred to as n squared, this time complexity refers to an
// algorithm that takes time proportional to the square of the input size.
// Consider the following code:

fun multiplicationBoard(size: Int) {
    for (number in 1..size) {
        print(" | ")
        for (otherNumber in 1..size) {
            print("$number x $otherNumber = ${number * otherNumber} |")
        }
        println()
    }
}

fun main() {
    multiplicationBoard(2)
}