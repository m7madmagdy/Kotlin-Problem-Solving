package codeWars.kyu7


fun points(games: List<String>): Int {
    return games.map {
        it.split(":")
    }.sumBy {
        when {
            it[0].toInt() > it[1].toInt() -> 3
            it[0].toInt() == it[1].toInt() -> 1
            else -> 0
        }
    }
}


fun main() {
    println(points(listOf("3:1", "2:2", "0:1")))
}