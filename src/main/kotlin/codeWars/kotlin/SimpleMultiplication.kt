package codeWars.kotlin

//Link: https://www.codewars.com/kata/583710ccaa6717322c000105/train/kotlin


fun simpleMultiplication(n: Int): Int {
    return if (n % 2 == 0) {
        n * 8
    } else {
        n * 9
    }
}

fun main(){
    print(
        simpleMultiplication(8)
    )
}