package com.capgemini.kotlinpractice

fun main() {
    val n1 = 81
    val n2 = 153
    var gcd = 1
    var i=1
    var lcm:Int
    lcm = if(n1>n2) n1 else n2

    while (i<=n1 && i<=n2){
        if(n1%i==0 && n2%i==0)
            gcd=i
        ++i
    }
    println("GCD: $gcd")

    while (true) {
        if(lcm%n1==0 && lcm%n2==0){
            println("LCM: $lcm")
            break
        }
        ++lcm
    }
}