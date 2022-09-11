package codeWars.kyu8


//Link: https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/kotlin

fun main() {
    print(
        expressionsMatter(1, 3, 1)
    )
}

//Solution
fun expressionsMatter(a: Int, b: Int, c: Int): Int {
    val con1 = a * (b + c)
    val con2 = a * b * c
    val con3 = a + b * c
    val con4 = (a + b) * c
    val con5 = a + b + c

    return maxOf(con1, con2, con3, con4, con5)
}