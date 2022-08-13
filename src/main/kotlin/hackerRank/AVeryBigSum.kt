package hackerRank

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L
    for (i in ar.indices) {
        sum += ar[i]
    }
    return sum
}

fun main() {
    readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
