package com.example.datastructurepractice.array



fun main(args: Array<String>) {

    var array = arrayOf(1, 4, 20, 3, 10, 5)
    var sum = 33
    var cSum = array[0]
    var j = 0
    var i = 1
    var flag = 0























    while (i < array.size)
    {
        if(cSum == sum)
        {
            flag = 1
            println("Sum found")
            break
        }
        else if(cSum < sum)
        {
            cSum += array[i]
            i++
        }
        else if(cSum > sum)
        {
            cSum -= array[j]
            j++
        }
    }

    if(flag ==0)
    {
        println("Sum not found")
    }

}