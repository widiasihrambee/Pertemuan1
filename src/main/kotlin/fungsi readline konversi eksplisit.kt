fun main() {
    //Double program parsing

    println("Enter a number and I'11 square it is the best : ")
    val input = readLine()!!
    var a = input.toInt() //eventually double
    a= a * 2
    println(a)

    println("Enter a number, and I'11 square it:  ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}