package codeWars.kyu7


//Link: https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/kotlin


fun main() {
    print(
        findShort("bitcoin take over the world maybe who knows parts of it")
    )
}


//Solution
fun findShort(s: String): Int {
    return s.split("").minOf {
        it.length
    }
}
