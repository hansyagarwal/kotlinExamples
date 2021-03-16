package com.capgemini.kotlinpractice

fun main() {
    val f = arrayOf(intArrayOf(2,3,4), intArrayOf(5,2,3))
    val s = arrayOf(intArrayOf(4,6,8), intArrayOf(0,4,9))

    val sum = Array(2){IntArray(3)}
    for(i in 0..1)
    {
        for(j in 0..2) {
            sum[i][j] = f[i][j] + s[i][j]
        }
    }
    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}