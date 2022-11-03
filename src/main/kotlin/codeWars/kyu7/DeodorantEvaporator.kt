package codeWars.kyu7

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
var days = 0
    var currentContent = content
    val thresholdContent = content * threshold / 100
    while (currentContent > thresholdContent) {
        currentContent -= currentContent * evap_per_day / 100
        days++
    }
    return days
}

fun main() {
    print(evaporator(10.0, 10.0, 10.0))
}