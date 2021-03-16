package com.capgemini.kotlinpractice

fun main(args: Array<String>) {
    println("Enter a number: ")

    val strInput = readLine()!!
    var i:Int = strInput.toInt()
    println("You entered: $i")
}