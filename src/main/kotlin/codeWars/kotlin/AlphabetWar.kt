package codeWars.kotlin

//Link: https://www.codewars.com/kata/59377c53e66267c8f6000027/train/kotlin

fun main() {
    print(
        alphabetWar("o")
    )
}

//Solution
fun alphabetWar(fight: String): String {
    val leftSide = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightSide = mapOf('m' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
    val forces = (leftSide + rightSide)

    val result = fight.sumOf {
        forces.getOrDefault(it, 0)
    }
    return when {
        result > 0 -> "Left side wins!"
        result < 0 -> "Right side wins!"
        else -> "Let's fight again!"
    }
}