package codeWars


fun main() {
    val x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    print(
        gps(20, x) // => print 41
    )
}

fun gps(s: Int, x: DoubleArray): Int {
    if (x.sum() <= 1) return 0

    var max = x[1] - x[0]
    for (i in 2 until x.size) {
        if (x[i] - x[i - 1] > max) {
            max = x[i] - x[i - 1]
        }
    }
    return (3600 * max / s).toInt()
}

