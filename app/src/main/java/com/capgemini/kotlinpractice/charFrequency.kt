package com.capgemini.kotlinpractice

fun main() {
    var str = "Geeks for Geeks"
    var ch: Char = 'e'
    var count=0
    for(i in str)
    {
        if(i == ch)
            count++
    }
    count=0
    for(i in 0..str.length-1)
    {
        if(str[i] == ch)
            count++
    }
    println("count: $count")
}