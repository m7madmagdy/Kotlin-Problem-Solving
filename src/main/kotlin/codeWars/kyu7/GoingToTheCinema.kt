package codeWars.kyu7

import kotlin.math.ceil


fun main() {
    print(
        movie(100, 10, 0.95)
    )
}


fun movie(card: Int, ticket: Int, perc: Double): Int {
    var times = 0
    var systemA = 0
    var systemB = card.toDouble()
    var prev = ticket.toDouble()
    while (systemA <= ceil(systemB)) {
        systemA += ticket
        prev *= perc
        systemB += prev
        times += 1
    }
    return times
}