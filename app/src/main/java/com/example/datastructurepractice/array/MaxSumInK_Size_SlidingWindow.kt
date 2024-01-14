package com.example.datastructurepractice.array

fun main(args: Array<String>) {

    var array = arrayOf(5, -10 , 6, 90 , 3)

    var k = 2
    var curSum = 0
    var maxSum = 0

    for(i in 0 until 2)
    {
        curSum += array[i]
    }

    for(i in k until  array.size)
    {
        curSum = curSum + array[i] - array[i-k]
        maxSum = maximumOf(curSum , maxSum)
    }

    println("Maximum sum in window k is ${maxSum}")
    /* array.forEach {
         print("$it  ,")
     }*/
}

fun maximumOf(curSum: Int, maxSum: Int): Int
{
    return if(curSum > maxSum)
    {
        curSum
    }
    else
    {
        maxSum
    }
}