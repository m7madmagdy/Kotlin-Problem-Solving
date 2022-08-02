package codeWars

// Link: https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/kotlin

fun main() {
    println(
        repeatStr("Mohamed", 4)
    )
}

// Solving
fun repeatStr(str: String, r: Int): String {
    return str.repeat(r)
}