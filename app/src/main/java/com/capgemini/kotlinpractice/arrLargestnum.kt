package com.capgemini.kotlinpractice

fun main() {
    val arr = arrayOf(45,21,5,65,87,39)
    var largest = arr[0]

    for(num in arr)
    {
        if(largest<num)
            largest = num
    }
    println(largest)
}