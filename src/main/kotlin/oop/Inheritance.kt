package oop

open class Vehicle {
    open fun drive() {
        println("Driving Super Vehicle")
    }
}

class Car : Vehicle() {
    override fun drive() {
        println("Driving a car")
    }
}

class Truck : Vehicle() {
    override fun drive() {
        println("Driving a truck")
    }
}

/*
In this example, we have a base class called Vehicle that has an open method called drive.
We have two subclasses of Vehicle, called Car and Truck,
which both override the drive method to provide their own implementation.

The Vehicle class is a base class that defines the behavior that
all vehicles should have (the ability to drive), and the Car and Truck classes are derived from it.
This allows us to create different types of vehicles that all have the same behavior,
but may implement it in different ways.

To use the Vehicle class, you can do something like this:
*/


fun main() {
    val vehicles = listOf(Vehicle(), Car(), Truck())
    for (vehicle in vehicles) {
        vehicle.drive()
    }
}