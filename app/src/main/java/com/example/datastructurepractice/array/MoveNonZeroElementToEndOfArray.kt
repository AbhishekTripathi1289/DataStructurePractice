package com.example.datastructurepractice.array

fun main(args: Array<String>) {

    var array = arrayOf(0, 0, 1, 3, 8, 5, 0, 10, 0, 20, 0, 0)
    var index = 0
    var temp = 0
    var i = 0

    for(i in 0 until array.size)
    {
        if(array[i] == 0)
        {
            temp = array[i]
            array[i] = array[index]
            array[index] = temp
            index++
        }
    }

    array.forEach {
        print("$it  ,")
    }
}