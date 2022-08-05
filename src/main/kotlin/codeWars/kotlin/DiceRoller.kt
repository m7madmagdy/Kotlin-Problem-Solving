package codeWars.kotlin


fun main() {
    print(
        move(2, 5)
    )
}


fun move(pos: Int, roll: Int): Int {
    return pos + (roll * 2)
}