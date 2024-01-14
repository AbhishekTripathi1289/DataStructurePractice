package com.example.datastructurepractice.array


fun main(args: Array<String>) {
    betterApproach()
}

fun betterApproach() {
    var array = arrayOf(3, 4, 8, -9, 9, 7)
    var preSum = 0
    var sum = 0

    for(i in 0 until array.size)
    {
        sum += array[i]
    }
    for(i in 0 until array.size)
    {
        preSum += array[i]
        if(preSum == sum)
        {
            println("Major Element found ${array[i]}")
        }
        sum -= array[i]
        println("presum = $preSum postsum = $sum")
    }
}


fun basicApproach()
{
    var array = arrayOf(3, 4, 8, -9, 9, 7)
    var preArray = IntArray(6)
    var postArray = IntArray(6)
    var sum = 0

    for(i in 0 until array.size)
    {
        sum += array[i]
        preArray[i]  = sum
    }
    var j = array.size-1
    sum = 0
    while(j >= 0)
    {
        sum += array[j]
        postArray[j] = sum
        j--
    }

    for(i in 0 until array.size)
    {
        if(preArray[i] == postArray[i])
        {
            println("Major Element found ${array[i]}")
        }
    }

}