package codeWars

// Link : https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/kotlin

fun main() {

    print(
        past(1, 30, 10)
    )

}


// Solving
fun past(h: Int, m: Int, s: Int): Int {
    val convertHours = h * 60 * 60 * 1000 //in milliseconds
    val convertMinutes = m * 60 * 1000 //in milliseconds
    val convertSeconds = s * 1000 //in milliseconds

    return convertHours + convertMinutes + convertSeconds
}