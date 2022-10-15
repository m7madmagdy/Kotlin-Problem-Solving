package dataStructures.stack

class StackC<T : Any>() : Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.size == 0) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }
}
