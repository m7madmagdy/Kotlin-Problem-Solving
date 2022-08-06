package codeWars.kotlin


//Link: https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/kotlin


fun main() {
    print(hero(2, 1))
}


//Solution
fun hero(bullets: Int, dragons: Int): Boolean {
    return bullets >= dragons * 2 // 2 is a number of bullets -> because every dragon can shoot 2 bullets
}