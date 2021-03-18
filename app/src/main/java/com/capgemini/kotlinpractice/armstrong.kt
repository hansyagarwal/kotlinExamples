package com.capgemini.kotlinpractice

fun main() {
    val num = 371
    var og: Int
    var remain:Int
    var res = 0
    og = num

    while (og!=0)
    {
        remain=og%10
        res += Math.pow(remain.toDouble(),3.0).toInt()
        og/=10
    }
    if(res == num)
        println("Armstrong")
    else
        println("not Armstrong")
}