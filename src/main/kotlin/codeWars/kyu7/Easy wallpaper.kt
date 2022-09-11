package codeWars.kyu7

import kotlin.math.ceil


fun main() {
    println(wallpaper(0.0, 3.5, 3.0))
}

fun wallpaper(l: Double, w: Double, h: Double): String {
    val area = l * w * h
    if (area <= 0) return "zero"

    return when (Math.ceil(((((l + w) * h * 2) / 5.2) * 1.15)).toInt()) {
        0 -> "zero"
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        9 -> "nine"
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        20 -> "twenty"
        else -> "more"
    }
}
