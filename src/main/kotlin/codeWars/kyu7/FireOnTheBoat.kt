package codeWars.kyu7

// Link: https://www.codewars.com/kata/57e8fba2f11c647abc000944/train/kotlin

fun main() {
    print(
        fireFight("Fire")
    )
}

// Solving
fun fireFight(s: String): String {
    return s.replace("Fire", "~~")
}