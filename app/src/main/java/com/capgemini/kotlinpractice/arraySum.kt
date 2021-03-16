package com.capgemini.kotlinpractice

fun main() {
    val arr = arrayOf(45,21,5,65,87,39)
    var sum = 0.0

    for(num in arr) {
        sum+=num
    }
    println("${sum/arr.size}")
}