package codeWars.kyu7

fun alphabetWar(fight: String): String {
    val forces = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
    val result = fight.mapIndexed { index, c ->
        if (c == '*' || (index - 1 >= 0 && fight[index - 1] == '*') || (index + 1 <= fight.lastIndex && fight[index + 1] == '*')) 0
        else forces.getOrDefault(c, 0)
    }.sumOf { it }

    return when {
        result > 0 -> "Left side wins!"
        result < 0 -> "Right side wins!"
        else -> "Let's fight again!"
    }
}

fun main() {
    println(alphabetWar("s*zz"))
    println(alphabetWar("www*www****z"))
    println(alphabetWar("sz**z**zs"))
}