package codeWars.kotlin


fun main() {
    print(
        makeNegative(-10)
    )
}

fun makeNegative(x: Int): Int {
    return when (x) {
        in Int.MIN_VALUE..0 -> x
        else -> -x
    }
}