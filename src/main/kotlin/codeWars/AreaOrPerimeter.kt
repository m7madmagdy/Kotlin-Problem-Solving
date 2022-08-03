package codeWars


fun main() {
    print(
        areaOrPerimeter(6, 10)
    )
}

fun areaOrPerimeter(l: Int, w: Int): Int {
    return if (l == w) l * w else 2 * (l + w)
}


