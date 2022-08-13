package hackerRank

//Link: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

fun simpleArraySum(ar: Array<Int>): Int {
    return ar.sum()
}

fun main() {
    readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
