package codeWars.kyu6


fun main() {
    print(
        encryptThis("Hello")
    )
}


fun encryptThis(text: String): String {
    val words = text.split(" ")
    val encryptedWords = mutableListOf<String>()
    words.forEach { word ->
        val firstLetter = word[0].code
        val lastLetter = word[word.lastIndex]
        val middleLetters = word.substring(1, word.lastIndex)
        val encryptedWord = "$firstLetter$lastLetter$middleLetters"
        encryptedWords.add(encryptedWord)
    }
    return encryptedWords.joinToString(" ")
}

