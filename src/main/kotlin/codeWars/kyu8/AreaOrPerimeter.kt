package codeWars.kyu8

// Link: https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/kotlin

fun main() {
    print(
        areaOrPerimeter(6, 10)
    )
}

fun areaOrPerimeter(l: Int, w: Int): Int {
    return if (l == w) l * w else 2 * (l + w)
}


