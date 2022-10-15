package dataStructures.stack

// TODO: There are only two essential operations for a stack:
//  1• push: Adding an element to the top of the stack.
//  2• pop: Removing the top element of the stack.

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
}