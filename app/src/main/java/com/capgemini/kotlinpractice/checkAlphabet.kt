package com.capgemini.kotlinpractice

fun main() {
    val c ='f'
    if(c>= 'a' && c<='z' || c>='A' && c<='Z')
        println("alphabet")
    else
        println("not alphabet")

    if(c in 'a'..'z')
        println("alpha is")
}