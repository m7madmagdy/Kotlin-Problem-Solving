package oop

/* TODO: Difference between abstract and interface classes
1- Interfaces can only contain abstract methods,
while abstract classes can contain both abstract and concrete methods.
2- A class can implement multiple interfaces, but it can only extend one abstract class.
3- An interface cannot contain any implementation code, while an abstract class can.
4- An interface has no constructor, while an abstract class can have a constructor.
5- An interface cannot have any member variables,
while an abstract class can have both member variables and properties.
6- An interface is used to define a set of related methods that a class can implement,
while an abstract class is used to provide a common base class for subclasses.
*/


interface InterfaceShape {
    fun getArea(): Double
}

abstract class AbstractShape {
    abstract fun getPerimeter(): Double

    abstract fun getInfo(): String
}

// A class that implements the Shape interface
class RectangleClass(private val width: Double, private val height: Double) : InterfaceShape {
    override fun getArea() = width * height
}

// A class that extends the AbstractShape abstract class
class CircleClass(private val radius: Double) : AbstractShape() {
    override fun getPerimeter() = 2 * Math.PI * radius
    override fun getInfo(): String = "This is a circle"
}

fun main() {
    val circle = CircleClass(20.0)
    val rectangle = RectangleClass(10.0, 20.0)
    val shapes = listOf(rectangle.getArea(), circle.getPerimeter())
    for (shape in shapes) {
        println(shape)
    }

    println(circle.getInfo())

}