package codeWars.kyu6

// Link: https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/kotlin

fun main() {
    print(
        twoSum(intArrayOf(1, 2, 3), 4) // [0, 2] -> this is indices of two numbers (1, 3) that == 4
    )
}


fun twoSum(numbers: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    numbers.forEachIndexed { index, num ->
        if (map.containsKey(target - num)) {
            return intArrayOf(map[target - num]!!, index)
        }
        map[num] = index
    }
    return intArrayOf()
}


//    val map = mutableMapOf<Int, Int>()
//    numbers.forEachIndexed { index, i ->
//        if (map.containsKey(target - i)) {
//            return Pair(map[target - i]!!, index)
//        }
//        map[i] = index
//    }
//    return Pair(0, 0)


//numbers.indices.forEach { i ->
//    for (j in i + 1 until numbers.size) {
//        if (numbers[i] + numbers[j] == target) {
//            return Pair(i, j)
//        }
//    }
//}
//return Pair(-1, -1)
