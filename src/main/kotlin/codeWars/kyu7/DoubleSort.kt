package codeWars.kyu7


// Link: https://www.codewars.com/kata/57cc79ec484cf991c900018d/train/kotlin

fun main() {
    val array = dbSort(arrayOf(2, 5, 1, 4, 3, "w", "d", "a"))
    array.forEach {
        println(it)
    }
}

fun dbSort(a: Array<Any>): Array<Any> {
    val stringArr = a.filterIsInstance<String>().sorted()
    val intArr = a.filterIsInstance<Int>().sorted()

    return (intArr + stringArr).toTypedArray()
}