package codeWars.kyu6

// Link: https://www.codewars.com/kata/581331293788bc1702001fa6/train/kotlin

fun main() {
    print(
        mirror("Hello Geeks")
    )
}


fun mirror(text: String): String {
    val lines = text.split(" ")
    val length = lines.maxOfOrNull { it.length }!! + 4
    val stars = "*".repeat(length)
    var string = stars + "\n"

    lines.forEach {
        val spaces = " ".repeat(length - it.length - 4)
        string += "* ${it.reversed()}$spaces *\n"
    }

    return string + stars
}


