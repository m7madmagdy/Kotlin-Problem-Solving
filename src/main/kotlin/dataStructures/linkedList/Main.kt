package dataStructures.linkedList

// TODO: Linked List A linked list is a collection of values arranged in a linear,
//  unidirectional sequence. A linked list has several theoretical advantages over
//  contiguous storage options such as the array, including constant time insertion
//  and removal from the front of the list, and other reliable performance characteristics.

fun main() {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    node1.next = node2
    node2.next = node3
    println(node1)

    "push" example {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)
        println(list)
    }
}

private infix fun String.example(function: () -> Unit) {}
