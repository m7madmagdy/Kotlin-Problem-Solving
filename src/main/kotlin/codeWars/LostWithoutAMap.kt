package codeWars


//Link: https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/kotlin

fun main(){
    val maps = maps(intArrayOf(1,2,3))
    maps.forEach {
        println(it)
    }
}

//Solution
fun maps(x: IntArray): IntArray {
    val result = x.map {it * 2}
    return result.toIntArray()
}