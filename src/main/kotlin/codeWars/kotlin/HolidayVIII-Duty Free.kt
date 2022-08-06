package codeWars.kotlin

//Link: https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/kotlin

fun main() {
    print(dutyFree(17, 10, 500))
}

//Solution
fun dutyFree(normPrice: Int, discount: Int, hol: Int):Int {
    return hol * 100 / (normPrice * discount)
}