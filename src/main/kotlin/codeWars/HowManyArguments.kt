package codeWars

//Link: https://www.codewars.com/kata/5c44b0b200ce187106452139/train/kotlin

fun main() {
    print(
        argsCount(1, 2, 3)
    )
}

//Solution
fun argsCount(vararg args: Any): Int {
    return args.size
}