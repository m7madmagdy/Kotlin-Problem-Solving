package codeWars.kyu8

//Link: https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/kotlin

fun main() {
    print(
        century(1901) // == Century(20)
    )
}


//Solution
fun century(number: Int): Int {
    return if (number % 100 != 0) {
        (number / 100) + 1
    } else {
        number / 100
    }
}