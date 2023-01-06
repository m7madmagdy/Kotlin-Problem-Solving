package dataStructures.linkedList

class LinkedList {
    private inner class Node(var data: Int, var next: Node?)

    private var head: Node? = null

    fun add(element: Int) {
        val newNode = Node(element, head)
        head = newNode
    }

    fun remove(): Int? {
        val data = head?.data
        head = head?.next
        return data
    }
}

/*
This linked list class has two methods: add,
which adds a new element to the front of the list, and remove,
which removes the element at the front of the list.
You can use this linked list class like this: TODO: Navigate to => Main.kt
*/