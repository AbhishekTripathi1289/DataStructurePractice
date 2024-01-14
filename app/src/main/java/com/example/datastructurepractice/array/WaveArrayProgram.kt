package com.example.datastructurepractice.array

fun main(args: Array<String>) {
    var array = arrayOf(5, 4, 3, 2, 1)
    var temp = 0
    for(i in 0 until array.size step 2)
    {
        if(i> 0 && array[i]< array[i-1])
        {
            temp = array[i]
            array[i] = array[i-1]
            array[i-1] = temp
        }
        if(i < array.size-1 && array[i] < array[i+1])
        {
            temp = array[i]
            array[i] = array[i+1]
            array[i+1] = temp
        }
    }

    array.forEach {
        print("$it  ,")
    }
}