package codeWars.kyu8


// Link: https://www.codewars.com/kata/5aa736a455f906981800360d/train/kotlin

fun main() {
    print(
        feast("great blue heron", "garlic naan")
    )
}

// Solving
fun feast(beast: String, dish: String): Boolean {
    if (beast[0] == dish[0] && beast[beast.length - 1] == dish[dish.length - 1]) {
        return true
    }
    return false
}