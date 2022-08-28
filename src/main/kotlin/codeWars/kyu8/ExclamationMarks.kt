package codeWars.kyu8


//Link: https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/kotlin

fun main() {
    print(
        replace("aeiou")
    )
}

//Solution
fun replace(s: String): String {
    val vowels = "aeiou" + "AEIOU"
    return s.replace(Regex("[$vowels]"), "!")
}