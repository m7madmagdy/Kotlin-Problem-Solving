package codeWars

// Link: https://www.codewars.com/kata/56747fd5cb988479af000028/train/kotlin

fun main() {
    print(
        getMiddle("test")
    )
}

// Solving
fun getMiddle(word: String): String {
    val middle = word.length / 2
    val even = word.length % 2 == 0

    return if (even) {
        word.substring(middle - 1, middle + 1)
    } else {
        word.substring(middle, middle + 1)
    }

    //another simple solution
    /** return word.substring((word.length - 1) / 2, word.length / 2 + 1) **/
}