package com.capgemini.kotlinpractice

fun main() {
    var sentence:String = "T his is a sentence"
    var s:String = ""

    for(i in 0..sentence.length-1)
    {
        if(sentence[i] != ' ')
            s+=sentence[i]
    }
    println("$s")
}