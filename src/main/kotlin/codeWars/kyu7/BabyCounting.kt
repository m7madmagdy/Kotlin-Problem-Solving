package codeWars.kyu7

//Link: https://www.codewars.com/kata/5bc9951026f1cdc77400011c/train/kotlin

fun main() {
    print(babyCount("baby"))
}


//Solution
fun babyCount(x: String): Int? {
    val countA = x.count { it.lowercaseChar() == 'a' }
    val countB = x.count { it.lowercaseChar() == 'b' }
    val countY = x.count { it.lowercaseChar() == 'y' }

    val result = minOf(countA, countB/2, countY)
    return if (result > 0) {
        result
    } else {
        null
    }
}