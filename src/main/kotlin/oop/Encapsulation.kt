package oop

// Encapsulation
class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }

    fun getBalance(): Double {
        return balance
    }
}

/*
In this example, the BankAccount class has a private field called balance,
which stores the current balance of the bank account.
The deposit and withdraw methods allow you to add or remove money from the balance,
and the getBalance method allows you to get the current balance.

By making the balance field private,
we are encapsulating the data within the BankAccount class.
This means that the balance can only be modified or accessed through the methods
provided by the class,
which helps to ensure that the balance is always in a consistent state.

To use the BankAccount class, you can do something like this:
*/

fun main() {
    val account = BankAccount()
    account.deposit(100.0)
    account.withdraw(50.0)
    val balance = account.getBalance()
    println(balance)
}
