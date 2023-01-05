package oop

abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

/*
In this example, we have an abstract class called Shape that has an abstract method called area.
This method must be implemented by any concrete subclasses of Shape.

We have two concrete subclasses of Shape, called Circle and Rectangle,
which both override the area method to provide their own implementation.

The Shape class is an example of abstraction because it defines the behavior
that all shapes must have (the ability to calculate their area),
but it does not provide a concrete implementation of this behavior.
This allows us to create different types of shapes that all have the same behavior,
but may implement it in different ways.

To use the Shape class, you can do something like this:
*/

fun main() {
    val shapes = listOf(Circle(10.0), Rectangle(5.0, 10.0))
    shapes.forEach {
        println(it.area())
    }
}