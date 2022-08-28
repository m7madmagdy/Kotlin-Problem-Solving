package codeWars.kyu8

// Link: https://www.codewars.com/kata/563a631f7cbbc236cf0000c2/train/kotlin

fun main() {
    print(
        move(3, 6)
    )
}


fun move(pos: Int, roll: Int): Int {
    return pos + (roll * 2)
}