package com.capgemini.kotlinpractice

fun main() {
    var og = 121
    var rev = 0
    var num = og
    var remain:Int

    while(num!=0)
    {
        remain = num%10
        rev = rev*10 + remain
        num/=10
    }
    if(og == rev)
        println("Palindrome")
    else
        println("not a Palindrome")
}