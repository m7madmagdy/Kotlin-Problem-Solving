package oop

// TODO: Here is an example of polymorphism in Kotlin using inheritance:
abstract class Animal {
    abstract fun makeNoise()
}

class Dog : Animal() {
    override fun makeNoise() {
        println("Woof!")
    }
}

class Cat : Animal() {
    override fun makeNoise() {
        println("Meow!")
    }
}

/*
In this example, we have an abstract class called Animal that has an abstract method called makeNoise.
We have two concrete subclasses of Animal,
called Dog and Cat, which both override the makeNoise method to provide their own implementation.

The Animal class is an example of polymorphism because
it defines the behavior that all animals should have (the ability to make a noise),
but it does not specify exactly how this behavior should be implemented.
This allows us to create different types of animals that all have the same behavior,
but may implement it in different ways.

To use the Animal class, you can do something like this:
*/

fun main() {
    val animals = listOf(Dog(), Cat())
    for (animal in animals) {
        animal.makeNoise()
    }
}


// TODO: Here is an example of polymorphism in Kotlin using interfaces:

interface Printable {
    fun print(): String
}

class Document : Printable {
    override fun print(): String {
        return "Printing document..."
    }
}

class Image : Printable {
    override fun print(): String {
        return "Printing image..."
    }
}

/*
In this example, we have an interface called Printable that has a method called print.
We have two classes, called Document and Image, which both implement
the Printable interface and provide their own implementation of the print method.

The Printable interface is an example of polymorphism because
it defines the behavior that all printable objects should have (the ability to be printed),
but it does not specify exactly how this behavior should be implemented.
This allows us to create different types of objects that all have the same behavior,
but may implement it in different ways.

To use the Printable interface, you can do something like this:
*/


// TODO: Using this code in main function
/*
    val printables = listOf(Document(), Image())
    for (printable in printables) {
        println(printable.print())
    }
*/