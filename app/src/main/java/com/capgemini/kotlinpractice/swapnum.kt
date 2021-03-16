package com.capgemini.kotlinpractice

fun main() {
    var f = 1.20f
    var s = 2.45f

    println("before swap")
    println("$f and $s")

    var temp = f
    f = s
    s = temp

    println("after swap")
    println("$f and $s")
}