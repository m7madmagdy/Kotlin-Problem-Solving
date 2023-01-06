package dataStructures.linkedList

// TODO: Linked List A linked list is a collection of values arranged in a linear,
//  unidirectional sequence. A linked list has several theoretical advantages over
//  contiguous storage options such as the array, including constant time insertion
//  and removal from the front of the list, and other reliable performance characteristics.

fun main() {
    val list = LinkedList()
    list.add(1)
    list.add(2)
    list.add(3)

    println(list.remove())  // prints 3
    println(list.remove())  // prints 2
    println(list.remove())  // prints 1
    println(list.remove())  // prints null
}

/*
Linked lists have a time complexity of O(1) for adding and removing elements
at the beginning of the list, but a time complexity of O(n) for accessing elements
by index or searching for an element. They have a space complexity of O(n),
as the number of elements in the list is directly proportional
to the amount of memory needed to store the list.
*/