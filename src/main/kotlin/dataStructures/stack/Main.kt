package dataStructures.stack

// TODO: Stack Data Structures: The stack data structure is identical in
//  concept to a physical stack of objects. When you add an item to a stack, you place
//  it on top of the stack. When you remove an item from a stack, you always remove
//  the topmost item. Stacks are useful, and also exceedingly simple. The main goal of
//  building a stack is to enforce how you access your data.


fun main() {
    val stack = StackC<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
    }
    print(stack)
    val poppedElement = stack.pop()
    if (poppedElement != null) {
        println("Popped: $poppedElement")
    }
    print(stack)
}